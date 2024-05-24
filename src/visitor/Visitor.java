package visitor;

import ast.Program;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public interface Visitor<TP, TR> {

    public TR visit(Program p, TP param);

    public TR visit(VarDefinition v, TP param);
    public TR visit(FunctionDefinition f, TP param);

    public TR visit(Assignment a, TP param);
    public TR visit(IfElse i, TP param);
    public TR visit(Read r, TP param);
    public TR visit(Return r, TP param);
    public TR visit(While w, TP param);
    public TR visit(Write w, TP param);

    public TR visit(Arithmetic a, TP param);
    public TR visit(ArrayAccess a, TP param);
    public TR visit(Cast c, TP param);
    public TR visit(Comparasion c, TP param);
    public TR visit(FieldAccess f, TP param);
    public TR visit(FunctionInvocation f, TP param);
    public TR visit(Logic l, TP param);
    public TR visit(UnaryMinus u, TP param);
    public TR visit(UnaryNot u, TP param);
    public TR visit(Variable v, TP param);
    public TR visit(CharLiteral c, TP param);
    public TR visit(IntLiteral i, TP param);
    public TR visit(FloatLiteral f, TP param);

    public TR visit(ArrayType i, TP param);
    public TR visit(CharType i, TP param);
    public TR visit(ErrorType i, TP param);
    public TR visit(FunctionType i, TP param);
    public TR visit(FloatType i, TP param);
    public TR visit(StructType i, TP param);
    public TR visit(VoidType i, TP param);

    public TR visit(StructField i, TP param);

    public TR visit(IntType i, TP o);
    public TR visit(For f, TP param);
}
