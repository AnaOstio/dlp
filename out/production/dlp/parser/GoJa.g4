grammar GoJa;	

program: REAL_CONSTANT
       ;

INT_CONSTANT: [0-9]+ 
            ;

REAL_CONSTANT: INT_CONSTANT? (REAL_1 | REAL_2)
               ;

REAL_1: '.'INT_CONSTANT?;
REAL_2: ('.'?)(INT_CONSTANT?)('E'|'e')(('+'|'-')?)INT_CONSTANT;