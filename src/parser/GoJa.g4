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

tipo_compuesto returns [Type ast]:
    IDENTIFICADOR
    | i='[' INT_CONSTANT ']' tipo
        { $ast = new ArrayType($i.getLine(), $i.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text), $tipo.ast); };

tipo_simple returns [Type ast]:
    'int' { $ast = IntType.getInstance(); }
    | 'char' { $ast = CharType.getInstance(); }
    | 'float32' { $ast = FloatType.getInstance(); } ;

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
sentencia returns [Statement ast]
          locals [List<Statement> body = new ArrayList<>(),
                List<Expression> params = new ArrayList<>();]:
     exp1=expresion '=' exp2=expresion ';' { $ast = new Assignment($exp1.ast.getLine(),$exp1.ast.getCharPositionInLine() + 1, $exp1.ast, $exp2.ast); }
     | l='write' expresiones ';' { $ast = new Write($l.getLine(), $l.getCharPositionInLine() + 1, $expresiones.ast); }
     | l='read' expresiones ';' { $ast = new Read($l.getLine(), $l.getCharPositionInLine() + 1, $expresiones.ast); }
     | l=IDENTIFICADOR '(' (expresiones { $params.addAll($expresiones.ast); })? ')' ';'
                    { $ast = new FunctionInvocation($l.getLine(), $l.getCharPositionInLine() + 1,
                        new Variable($l.getLine(), $l.getCharPositionInLine() + 1, $l.text, $params
                    ); }
     | l='return' expresion ';' { $ast = new Return($l.getLine(), $l.getCharPositionInLine() + 1, $expresion.ast); }
     | l='while' '(' e=expresion ')' (s=sentencia { $body.add($s.ast); } | '{' ss=sentencia* { $body.addAll($ss.ast); } '}')
                    { $ast = new While($l.getLine(), $l.getCharPositionInLine() + 1, $e.ast, $body.ast); }
     | 'if' '(' e=expresion ')' (s=sentencia | '{' ss=sentencia* '}') ('else' (sn=sentencia | '{' ssn=sentencia* '}'))?
    ;

expresiones returns [List<Expression> ast = new ArrayList<>()]:
    expresion { $ast.add($expresion.ast); }
    | expresion ',' expresiones { $expresiones.ast.add($expresion.ast); }
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