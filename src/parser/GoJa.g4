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

tipo returns [Type ast]:
    tipo_simple { $ast = $tipo_simple.ast}
    | tipo_compuesto { $ast = $tipo_compuesto.ast}
    ;

tipo_compuesto:
    IDENTIFICADOR
    | ('[' INT_CONSTANT ']')+tipo_simple ;

tipo_simple returns [Type ast]:
    'int' { $ast = new IntType(); }
    | 'char' { $ast = new CharType(); }
    | 'float32' { $ast = new FloatType(); } ;

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
    | '-' expresion
            { $ast = new UnaryMinus($expresion.ast.getLine(), $expresion.ast.getCharPositionInLine() + 1, $expresion.ast); }
    | '!' expresion { $ast = new UnaryNot($expresion.ast.getLine(), $expresion.ast.getCharPositionInLine() + 1, $expresion.ast); }
    | exp1=expresion op=( '*' | '/' | '%' ) exp2=expresion
                    { $ast = new Arithmetic($exp1.ast.getLine(), $exp1.ast.getCharPositionInLine() + 1, $exp1.ast, $exp2.ast, $op.text); }
    | exp1=expresion op=('+' | '-' ) exp2=expresion
                    { $ast = new Arithmetic($exp1.ast.getLine(), $exp1.ast.getCharPositionInLine() + 1, $exp1.ast, $exp2.ast, $op.text); }
    | exp1=expresion op=('<' | '>' | '<=' | '>=' | '!=' | '==' ) exp2=expresion
                    { $ast = new Comparasion($exp1.ast.getLine(), $exp1.ast.getCharPositionInLine() + 1, $exp1.ast, $exp2.ast, $op.text); }
    | exp1=expresion op=('&&' | '||' ) exp2=expresion
                    { $ast = new Logic($exp1.ast.getLine(), $exp1.ast.getCharPositionInLine() + 1, $exp1.ast, $exp2.ast, $op.text); }
    | IDENTIFICADOR '(' (expresion { $lista.add($expresion.ast); } ((',' expresion)*)? { $ast = $expresion.ast; }) ')'
    | tipo '(' expresion ')' { $ast = new Cast($expresion.ast.getLine(), $expresion.ast.getCharPositionInLine() + 1, $tipo.ast, $expresion.ast); }
    | '(' expresion ')' { $ast = $expresion.ast; }
    | exp1=expresion '[' exp2=expresion ']'
                    { $ast = new ArrayAccess($exp1.ast.getLine(), $exp1.ast.getCharPositionInLine() + 1, $exp1.ast, $exp2.ast); }
    | exp1=expresion '.' IDENTIFICADOR
                    { $ast = new FieldAccess($exp1.ast.getLine(), $exp1.ast.getCharPositionInLine() + 1, $IDENTIFICADOR, $exp1.ast); }
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