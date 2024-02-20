grammar GoJa;	

// Tengo que cambiar esto de program para que sea una lista de de definiciones de variables y/o de funciones
program: definition*
       ;

definition:
    def_variable
    | func_definition
    ;

tipo:
    tipo_simple
    | tipo_compuesto
    ;

tipo_compuesto:
    IDENTIFICADOR
    | ('[' INT_CONSTANT ']')+tipo_simple ;

tipo_simple:
    'int'
    | 'char'
    | 'float32';

definicion:
    def_variable
    | struct_definition
    ;

def_variable:
     'var' IDENTIFICADOR ( ',' IDENTIFICADOR)*? tipo ';';

struct_definition:
     'var' IDENTIFICADOR 'struct {' def_variable* '};';

func_definition:
    'func' IDENTIFICADOR '(' func_parameters* ')' tipo_simple? '{' definicion* sentencia* '}'
    ;

func_parameters:
    'var' IDENTIFICADOR tipo_simple
    | 'var' IDENTIFICADOR tipo_simple (',' 'var' IDENTIFICADOR tipo_simple)*
    ;

// Expresiones
expresion:
    INT_CONSTANT
    | REAL_CONSTANT
    | CHAR_CONSTANT
    | IDENTIFICADOR
    | '-' expresion
    | '!' expresion
    | expresion ( '*' | '/' | '%' ) expresion
    | expresion ('+' | '-' ) expresion
    | expresion ('<' | '>' | '<=' | '>=' | '!=' | '==' ) expresion
    | expresion ('&&' | '||' ) expresion
    | IDENTIFICADOR '(' (expresion (',' expresion)*)? ')'
    | tipo '(' expresion ')'
    | '(' expresion ')'
    | expresion '[' expresion ']'
    | expresion '.' IDENTIFICADOR
    ;

// sentencias
sentencia:
     expresion '=' expresion ';'
     | 'write' expresion (',' expresion)* ';'
     | 'read' expresion (',' expresion)* ';'
     | IDENTIFICADOR '(' (expresion (',' expresion)*)? ')' ';'
     | 'return' expresion ';'
     | 'while (' expresion ')' (sentencia | '{' sentencia* '}')
     | 'if' '(' expresion ')' (sentencia | '{' sentencia* '}') ('else' (sentencia | '{' sentencia* '}'))?
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