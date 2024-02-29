grammar GoJa;

@header {
    import ast.*;
    import ast.statements.*;
    import ast.types.*;
    import ast.expressions.*;
    import ast.definitions.*;
    import java.util.List;
}

program:
    definiciones*
    'func' 'main' '(' ')' '{' var_definition* statement* '}'
    EOF
;

definiciones:
    v=var_definition
    | func_definition
;

var_definition:
    'var' vars tipo ';'
    | 'var' IDENTIFICADOR 'struct' '{' var_definition* '}' ';'
;

vars:
    IDENTIFICADOR
    | IDENTIFICADOR ',' vars
;

func_definition:
    'func' IDENTIFICADOR '(' params? ')' tipo_simple? '{' var_definition* statement* '}'
;

statement:
    expresion '=' expresion ';'
    |  IDENTIFICADOR '(' expresiones? ')' ';'
    | 'write' expresiones ';'
    | 'read' expresiones ';'
    | 'return' expresion ';'
    | 'while' '(' expresion ')' statements
    | 'if' '(' expresion ')' tBody=statements* ( 'else' fBody=statements)?
;

statements:
    statement
    | '{' statement* '}'
;


// TODO Comprobar que funcionan todas y cada una de ellas
expresion:
    INT_CONSTANT
    | REAL_CONSTANT
    | CHAR_CONSTANT
    | IDENTIFICADOR
    | IDENTIFICADOR '(' expresiones? ')'
    | '(' expresion ')'
    | tipo '(' expresion ')'
    | expresion '[' expresion ']'
    | expresion '.' expresion
    | '!' expresion
    | '-' expresion
    | exp1=expresion op=( '*' | '/' | '%' ) exp2=expresion
    | exp1=expresion op=('+' | '-' ) exp2=expresion
    | exp1=expresion op=('<' | '>' | '<=' | '>=' | '!=' | '==' ) exp2=expresion
    | exp1=expresion op=('&&' | '||' ) exp2=expresion
;

expresiones:
    expresion
    | expresion ',' expresiones
;

params:
    param
    | param ',' params
;

param:
    'var' IDENTIFICADOR tipo_simple
;

tipo:
    tipo_simple
    | '[' INT_CONSTANT ']' tipo
;

tipo_simple:
    'char'
    | 'float32'
    | 'int'
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