grammar GoJa;	

program:
       ;

INT_CONSTANT: [0-9]+ 
            ;

REAL_CONSTANT: INT_CONSTANT? (REAL_1 | REAL_2)
               ;

REAL_1: '.'INT_CONSTANT;
REAL_2: ('.'?)(INT_CONSTANT?)('E'|'e')(('+'|'-')?)INT_CONSTANT;

CHAR_CONSTANT: '\'' . '\'' | '\'\\n\''
    | '\'\\t\''
    | '\'\\' [0-9][0-9][0-9] '\''
    ;

IDENTIFICADOR: ([a-zA-Z] | '_')[a-zA-Z0-9_]*;

COMMENT
	: '//' .*? ('\n' | EOF) -> skip
	;

MULTI_COMMENT
	: '/*' .*? '*/' -> skip
	;

WS
	: [ \t\r\n]+ -> skip
	;