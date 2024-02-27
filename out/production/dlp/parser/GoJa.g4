grammar GoJa;

@header {
    import ast.*;
    import ast.statements.*;
    import ast.types.*;
    import ast.expressions.*;
    import ast.definitions.*;
    import java.util.List;
}

// Tengo que cambiar esto de program para que sea una lista de de definiciones de variables y/o de funciones
program returns [ASTNode ast]: definition*
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
expresion returns [Expression ast]
            locals [List<Expression> lista = new ArrayList<>()]:

    INT_CONSTANT { $ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
    | REAL_CONSTANT { $ast = new FloatLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($REAL_CONSTANT.text)); }
    | CHAR_CONSTANT { $ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text)); }
    | IDENTIFICADOR { $ast = new Variable($IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine() + 1, $IDENTIFICADOR.text); }
    | '-' exp=expresion { $ast = new UnaryMinus($exp.getLine(), $exp.getCharPositionInLine() + 1, $exp.ast); }
    | '!' exp=expresion { $ast = new UnaryNot($exp.getLine(), $exp.getCharPositionInLine() + 1, $exp.ast); }
    | exp1=expresion op=( '*' | '/' | '%' ) exp2=expresion
                    { $ast = new Arithmetic($exp1.getLine(), $exp1.getCharPositionInLine() + 1, $exp1.ast, $exp2.ast, $op.text); }
    | exp1=expresion op=('+' | '-' ) exp2=expresion
                    { $ast = new Arithmetic($exp1.getLine(), $exp1.getCharPositionInLine() + 1, $exp1.ast, $exp2.ast, $op.text); }
    | exp1=expresion op=('<' | '>' | '<=' | '>=' | '!=' | '==' ) exp2=expresion
                    { $ast = new Comparasion($exp1.getLine(), $exp1.getCharPositionInLine() + 1, $exp1.ast, $exp2.ast, $op.text); }
    | exp1=expresion op=('&&' | '||' ) exp2=expresion
                    { $ast = new Logic($exp1.getLine(), $exp1.getCharPositionInLine() + 1, $exp1.ast, $exp2.ast, $op.text); }
    | IDENTIFICADOR '(' (expresion (',' expresion)*)? ')'
    | tipo '(' expresion ')' { $ast = new Cast($exp1.getLine(), $expresion.getCharPositionInLine() + 1, $type.ast, $expresion.ast; }
    | '(' expresion ')' { $ast = $expresion.ast}
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