grammar GoJa;	

program: def_variable
       ;

// Meterle ya algo de restriccion a los tipos
tipo:
    'int' | 'char' | 'float32' | IDENTIFICADOR | '[' INT_CONSTANT ']'tipo;

def_variable:
     'var' IDENTIFICADOR ( ',' IDENTIFICADOR)*? tipo;

struct_definition:
     'var' IDENTIFICADOR 'struct {' def_variable*? '}';

// Expresiones
// Hay que poner precedencia de signos
expresion:
    INT_CONSTANT | REAL_CONSTANT | CHAR_CONSTANT | IDENTIFICADOR
    | expresion ('+' | '-' | '*' | '/' | '%' ) expresion
    | expresion ('<' | '>' | '<=' | '>=' | '!=' | '==' ) expresion
    | expresion ('&&' | '||' ) expresion
    | '-' expresion
    | '!' expresion
    | IDENTIFICADOR '(' (expresion (',' expresion)*)? ')'
    | tipo '(' expresion ')'
    | '(' expresion ')'
    | expresion '[' expresion ']'
    | expresion '.' IDENTIFICADOR
    ;

sentencia:
     expresion '=' expresion ';'
     | 'write' expresion (',' expresion)* ';'
     | 'read' expresion (',' expresion)* ';'
     | IDENTIFICADOR '(' (expresion (',' expresion)*)? ')' ';'
     | 'return' expresion ';'
     | 'while (' expresion ')' sentencia*  // esto hay que mirarlo bien
     | 'if' '(' expresion ')' sentencia ('else' sentencia )?  // esto hay que mirarlo bien, tambien puede estar vacio siempre que lleve '{}'
    ;


// LEXICO
INT_CONSTANT: [0-9]+ 
            ;

REAL_CONSTANT: (REAL_1 | REAL_2 )
               ;

REAL_1: '.'INT_CONSTANT | INT_CONSTANT'.' | INT_CONSTANT'.'INT_CONSTANT;
REAL_2: INT_CONSTANT? ('.'?)(INT_CONSTANT?)('E'|'e')(('+'|'-')?)INT_CONSTANT;

CHAR_CONSTANT: '\'' . '\'' | '\'\\n\''
    | '\'\\t\''
    | '\'\\' [0-9]?[0-9]?[0-9] '\''
    ;

IDENTIFICADOR: [a-zA-Z][a-zA-Z0-9_]* |  '_'[a-zA-Z0-9_]+;

COMMENT
	: '//' .*? ('\n' | EOF) -> skip
	;

MULTI_COMMENT
	: '/*' .*? '*/' -> skip
	;

WS
	: [ \t\r\n]+ -> skip
	;