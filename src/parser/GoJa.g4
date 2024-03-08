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
        locals [List<Definition> defs = new ArrayList<>(),
            List<Statement> cuerpo = new ArrayList<>(); ]:

    (d=definiciones { $defs.addAll($d.ast); })*
    l='func' m='main' '(' ')' '{' (var_definition { $cuerpo.addAll($var_definition.ast) ;})*
                                              (statement { $cuerpo.add($statement.ast) ;})* '}'
        { $defs.add(
            new FunctionDefinition($l.getLine(), $l.getCharPositionInLine() + 1,
                            new FunctionType($l.getLine(), $l.getCharPositionInLine() + 1, VoidType.getInstance(), new ArrayList<>())
                            , $m.text, $cuerpo)
        );}
    EOF

    { $ast = new Program(1, 1, $defs); }
;

definiciones returns [List<Definition> ast = new ArrayList<>();]:
    v=var_definition { $ast.addAll($v.ast); }
    | f=func_definition { $ast.add($f.ast); }
;

var_definition returns [List<VarDefinition> ast = new ArrayList<>();]
                locals [List<VarDefinition> campos = new ArrayList<>(),
                        List<String> cFields = new ArrayList<>(),
                        List<String> cDefs = new ArrayList<>();]:
    l='var' vars tipo ';'
        {
            for (String id: $vars.ast) {
                if($cDefs.contains(id)){
                    ErrorType t = new ErrorType("Variable " + id + " ya definida", $l.getLine(), $l.getCharPositionInLine() + 1);
                } else {
                    $ast.add(new VarDefinition($l.getLine(), $l.getCharPositionInLine() + 1, $tipo.ast, id));
                }
                $cDefs.add(id);

            }
        }
    | l='var' vars 'struct' '{' (v=var_definition { $campos.addAll($v.ast); })* '}' ';'
        {   for(String id: $vars.ast){

                $ast.add( new VarDefinition($l.getLine(), $l.getCharPositionInLine() + 1,
                               new StructType($l.getLine(), $l.getCharPositionInLine() + 1, $campos),
                                id
                            ));
            }
        }
;

vars returns [List<String> ast = new ArrayList<>();]:
    IDENTIFICADOR { $ast.add($IDENTIFICADOR.text); }
    | IDENTIFICADOR ',' vars { $vars.ast.add($IDENTIFICADOR.text); $ast = $vars.ast; }
;

func_definition returns [FunctionDefinition ast]
                locals [Type t = VoidType.getInstance(),
                    List<VarDefinition> fparams = new ArrayList<>(),
                    List<Statement> cuerpo = new ArrayList<>();]:

    l='func' IDENTIFICADOR '(' (params { $fparams.addAll($params.ast); })? ')'
        (tipo_simple { $t = $tipo_simple.ast; })? '{' (var_definition { $cuerpo.addAll($var_definition.ast) ;})*
            (statement { $cuerpo.add($statement.ast) ;})* '}'

            { $ast = new FunctionDefinition($l.getLine(), $l.getCharPositionInLine() + 1,
                new FunctionType($l.getLine(), $l.getCharPositionInLine() + 1, $t, $fparams)
                , $IDENTIFICADOR.text, $cuerpo);}
;

statement returns [Statement ast]
        locals [List<Expression> fparams = new ArrayList<>(),
                List<Statement> elseBody = new ArrayList<>();]:
    exp1=expresion '=' exp2=expresion ';'
            { $ast = new Assignment($exp1.ast.getLine(),$exp1.ast.getColumn(), $exp1.ast, $exp2.ast); }
    | l='write' expresiones ';'
            { $ast = new Write($l.getLine(), $l.getCharPositionInLine() + 1, $expresiones.ast); }
    | l='read' expresiones ';'
            { $ast = new Read($l.getLine(), $l.getCharPositionInLine() + 1, $expresiones.ast); }
    | l='return' expresion ';'
            { $ast = new Return($l.getLine(), $l.getCharPositionInLine() + 1, $expresion.ast); }
    | l='while' '(' expresion ')' statements
            { $ast = new While($l.getLine(), $l.getCharPositionInLine() + 1, $expresion.ast, $statements.ast); }
    | l='if' '(' expresion ')' tBody=statements ( 'else' (fBody=statements { $elseBody.addAll($fBody.ast); }))?
            { $ast = new IfElse($l.getLine(), $l.getCharPositionInLine() + 1, $expresion.ast, $tBody.ast, $elseBody); }
    |  l=IDENTIFICADOR '(' (expresiones { $fparams.addAll($expresiones.ast); })? ')' ';'
            { $ast = new FunctionInvocation($l.getLine(), $l.getCharPositionInLine() + 1,
                     new Variable($l.getLine(), $l.getCharPositionInLine() + 1, $l.text), $fparams);}
;

statements returns [List<Statement> ast = new ArrayList<>();]:
    statement { $ast.add($statement.ast); }
    | '{' (statement { $ast.add($statement.ast); })* '}'
;


expresion returns [Expression ast]
            locals [List<Expression> fparams = new ArrayList<>();]:

    '(' expresion ')' { $ast = $expresion.ast; }
    | exp1=expresion '.' IDENTIFICADOR
                { $ast = new FieldAccess($exp1.ast.getLine(), $exp1.ast.getColumn(), $exp1.ast, $IDENTIFICADOR.text) ;}
    | exp1=expresion '[' exp2=expresion ']'
                { $ast = new ArrayAccess($exp1.ast.getLine(), $exp1.ast.getColumn() + 1, $exp1.ast, $exp2.ast); }
    | tipo_simple '(' expresion ')'
            { $ast = new Cast($tipo_simple.ast.getLine(), $tipo_simple.ast.getColumn(), $tipo_simple.ast, $expresion.ast); }
    | l='-' expresion
                 { $ast = new UnaryMinus($l.getLine(), $l.getCharPositionInLine() + 1, $expresion.ast); }
    | l='!' expresion
             { $ast = new UnaryNot($l.getLine(), $l.getCharPositionInLine() + 1, $expresion.ast); }
    | exp1=expresion op=( '*' | '/' | '%' ) exp2=expresion
            { $ast = new Arithmetic($exp1.ast.getLine(), $exp1.ast.getColumn(), $exp1.ast, $exp2.ast, $op.text); }
    | exp1=expresion op=('+' | '-' ) exp2=expresion
            { $ast = new Arithmetic($exp1.ast.getLine(), $exp1.ast.getColumn(), $exp1.ast, $exp2.ast, $op.text); }
    | exp1=expresion op=('<' | '>' | '<=' | '>=' | '!=' | '==' ) exp2=expresion
            { $ast = new Comparasion($exp1.ast.getLine(), $exp1.ast.getColumn(), $exp1.ast, $exp2.ast, $op.text); }
    | exp1=expresion op=('&&' | '||' ) exp2=expresion
            { $ast = new Logic($exp1.ast.getLine(), $exp1.ast.getColumn(), $exp1.ast, $exp2.ast, $op.text); }
    | l=IDENTIFICADOR '(' (expresiones { $fparams.addAll($expresiones.ast); })? ')'
                 { $ast = new FunctionInvocation($l.getLine(), $l.getCharPositionInLine() + 1,
                          new Variable($l.getLine(), $l.getCharPositionInLine() + 1, $l.text), $fparams);}
    | INT_CONSTANT
            { $ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
    | REAL_CONSTANT
            { $ast = new FloatLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($REAL_CONSTANT.text)); }
    | CHAR_CONSTANT
             { $ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text)); }
    | IDENTIFICADOR
             { $ast = new Variable($IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine() + 1, $IDENTIFICADOR.text); }
;

expresiones returns [List<Expression> ast = new ArrayList<>();]:
    expresion { $ast.add($expresion.ast); }
    | expresion ',' expresiones { $ast.add($expresion.ast); $ast = $expresiones.ast; }
;

params returns [List<VarDefinition> ast = new ArrayList<>();]:
    param { $ast.add($param.ast); }
    | param ',' params { $params.ast.add($param.ast); $ast = $params.ast; }
;

param returns [VarDefinition ast]:
    l='var' IDENTIFICADOR tipo_simple
        {$ast = new VarDefinition($l.getLine(), $l.getCharPositionInLine() + 1, $tipo_simple.ast, $IDENTIFICADOR.text); }
;

tipo returns [Type ast]
        locals [List<VarDefinition> campos = new ArrayList<>()]:
    t=tipo_simple { $ast = $t.ast; }
    | a='[' s=INT_CONSTANT ']' ti=tipo
            { $ast = new ArrayType($a.getLine(), $a.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($s.text), $ti.ast);}
    | a='struct' '{'
        (var_definition { $campos.addAll($var_definition.ast); })* { $ast = new StructType($a.getLine(), $a.getCharPositionInLine() + 1, $campos); }
    '}'
;

tipo_simple returns [Type ast]:
    'int' { $ast = IntType.getInstance(); }
    | 'char' { $ast = CharType.getInstance(); }
    | 'float32' { $ast = FloatType.getInstance(); }
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