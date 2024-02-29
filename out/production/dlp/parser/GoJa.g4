grammar GoJa;

@header {
    import ast.*;
    import ast.statements.*;
    import ast.types.*;
    import ast.expressions.*;
    import ast.definitions.*;
    import java.util.List;
}

program returns [Program ast]
        locals [List<Definition> others = new ArrayList<>(),
                List<Statement> mainBody = new ArrayList<Statement>();]:

        ( definiciones { $others.addAll($definiciones.ast); } )*
        f='func' m='main' '(' ')' '{'
            (var_definition { $mainBody.addAll($var_definition.ast); })*
            (s=statement { $mainBody.addAll($s.ast); })*
            '}'

            { $others.add(new FunctionDefinition($f.getLine(), $f.getCharPositionInLine() + 1,
                    new FunctionType($f.getLine(), $f.getCharPositionInLine() + 1,
                    VoidType.getInstance(), new ArrayList<VarDefinition>()),
                    $m.text, $mainBody
                ));}

        { $ast = new Program(1, 1, $others); }
        EOF
    ;

definiciones returns [List<Definition> ast = new ArrayList<>(); ]:
    v=var_definition { $ast.addAll($v.ast); }
    | f=func_definition  { $ast.add($f.ast); }
    ;

var_definition returns [List<VarDefinition> ast = new ArrayList<>();]:
    l='var' vars tipo ';'
        {   for(String v: $vars.ast) {
                $ast.add(new VarDefinition($l.getLine(), $l.getCharPositionInLine() + 1, $tipo.ast, v));
            }
        }
    // se pueden structs como variables globales? -> si
    l='var' vars 'struct' '{'  '}' ';'
    ;

vars returns [List<String> ast = new ArrayList<>();]:
    IDENTIFICADOR { $ast.add($IDENTIFICADOR.text); }
    | IDENTIFICADOR ',' vars { $vars.ast.add($IDENTIFICADOR.text); $ast = $vars.ast; }
    ;

tipo returns [Type ast]:
    tipo_simple { $ast = $tipo_simple.ast; }
    | i='[' INT_CONSTANT ']' tipo
        {  $ast = new ArrayType($i.getLine(), $i.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text), $tipo.ast); }
    ;

func_definition returns [FunctionDefinition ast]
                // esto asi estaria bien para poder restringuir ya el tipo?
                locals [ Type t = VoidType.getInstance(),
                List<VarDefinition> lparams = new ArrayList<>(),
                List<Statement> body = new ArrayList<>();]:

        d='def' id=IDENTIFICADOR '(' (p=params { $lparams.addAll($p.ast); } )? ')'
            (tipo_simple { $t = $tipo_simple.ast; })? '{'

             (v=var_definition { $body.addAll($v.ast); })*
             (s=statement { $body.addAll($s.ast); })* '}'

        { $ast = new FunctionDefinition($d.getLine(), $d.getCharPositionInLine() + 1,
                                     new FunctionType($d.getLine(), $d.getCharPositionInLine() + 1,
                                     $t, $lparams),
                                     $id.text, $body
                                 );}
    ;

tipo_simple returns [Type ast]:
    'int' { $ast = IntType.getInstance(); }
    | 'char' { $ast = CharType.getInstance(); }
    | 'float32' { $ast = FloatType.getInstance(); } ;

params returns [List<VarDefinition> ast = new ArrayList<>();]:
    param { $ast.add($param.ast); }
    | param ',' p=params { $p.ast.add($param.ast); $ast = $p.ast;}
    ;

param returns [VarDefinition ast]:
        d='var' IDENTIFICADOR tipo_simple
         { $ast = new VarDefinition($d.getLine(), $d.getCharPositionInLine() + 1, $tipo_simple.ast, $IDENTIFICADOR.text); }
    ;

statement returns [Statement ast]
            locals [List<Expression> fparams = new ArrayList<>(); ]:
    exp1=expresion '=' exp2=expresion ';' { $ast = new Assignment($exp1.ast.getLine(),$exp1.ast.getColumn(), $exp1.ast, $exp2.ast); }
    | l='write' expresiones ';'
            { $ast = new Write($l.getLine(), $l.getCharPositionInLine() + 1, $expresiones.ast); }
    | l='read' expresiones ';'
            { $ast = new Read($l.getLine(), $l.getCharPositionInLine() + 1, $expresiones.ast); }
    | l=IDENTIFICADOR '(' (expresiones { $fparams.addAll($expresiones.ast); }) ? ')'
            { $ast = new FunctionInvocation($l.getLine(), $l.getCharPositionInLine() + 1,
                new Variable($l.getLine(), $l.getCharPositionInLine() + 1, $l.text), $fparams); }
    | l='return' expresion ';' { $ast = new Return($l.getLine(), $l.getCharPositionInLine() + 1, $expresion.ast); }
    | l='while' '(' expresion ')' (statements)?
            { $ast = new While($l.getLine(), $l.getCharPositionInLine() + 1, $expresion.ast, $statements.ast); }
    | l='if' '(' expresion ')' (st=statements)? ( 'else' (sn=statements)?)?
            { $ast = new IfElse($l.getLine(), $l.getCharPositionInLine() + 1, $expresion.ast, $st.ast, $sn.ast); }

    ;

statements returns [List<Statement> ast = new ArrayList<>();]:
    statement { $ast.add($statement.ast); }
    | '{' (statement { $ast.add($statement.ast); })* '}'
    ;

expresion returns [ Expression ast]
            locals [List<Expression> fparams = new ArrayList<>(); ]:
     INT_CONSTANT
            { $ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
     | REAL_CONSTANT
            { $ast = new FloatLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($REAL_CONSTANT.text)); }
     | CHAR_CONSTANT
            { $ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text)); }
     | IDENTIFICADOR
            { $ast = new Variable($IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine() + 1, $IDENTIFICADOR.text); }
     | l='-' expresion
             { $ast = new UnaryMinus($l.getLine(), $l.getCharPositionInLine() + 1, $expresion.ast); }
     | exp1=expresion op=( '*' | '/' | '%' ) exp2=expresion
             { $ast = new Arithmetic($exp1.ast.getLine(), $exp1.ast.getColumn(), $exp1.ast, $exp2.ast, $op.text); }
     | exp1=expresion op=('+' | '-' ) exp2=expresion
             { $ast = new Arithmetic($exp1.ast.getLine(), $exp1.ast.getColumn(), $exp1.ast, $exp2.ast, $op.text); }
     | exp1=expresion op=('<' | '>' | '<=' | '>=' | '!=' | '==' ) exp2=expresion
             { $ast = new Comparasion($exp1.ast.getLine(), $exp1.ast.getColumn(), $exp1.ast, $exp2.ast, $op.text); }
     | exp1=expresion op=('&&' | '||' ) exp2=expresion
             { $ast = new Logic($exp1.ast.getLine(), $exp1.ast.getColumn(), $exp1.ast, $exp2.ast, $op.text); }
     | tipo '(' expresion ')'
             { $ast = new Cast($tipo.ast.getLine(), $tipo.ast.getColumn(), $tipo.ast, $expresion.ast); }
     | '(' expresion ')' { $ast = $expresion.ast; }
     | exp1=expresion '[' exp2=expresion ']'
             { $ast = new ArrayAccess($exp1.ast.getLine(), $exp1.ast.getColumn() + 1, $exp1.ast, $exp2.ast); }
     | l=IDENTIFICADOR '(' (expresiones { $fparams.addAll($expresiones.ast); }) ? ')'
            { $ast = new FunctionInvocation($l.getLine(), $l.getCharPositionInLine() + 1,
                new Variable($l.getLine(), $l.getCharPositionInLine() + 1, $l.text), $fparams); }
     | exp1=expresion '.' exp2=expresion
            { $ast = new FieldAccess($exp1.ast.getLine(), $exp1.ast.getColumn(), $exp1.ast, $exp2.ast) ;}
     ;



expresiones returns [List<Expression> ast = new ArrayList<>();]:
    expresion { $ast.add($expresion.ast);}
    | expresion ',' expresiones { $expresiones.ast.add($expresion.ast); $ast = $expresiones.ast; }
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