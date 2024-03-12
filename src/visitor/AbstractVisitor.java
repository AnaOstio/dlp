package visitor;

import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public abstract class AbstractVisitor<TP, TR> implements Visitor<TP, TR>{

    @Override
    public TR visit(Program p, TP param) {
        for (Definition d: p.getBody())
            d.accept(this, param);
        return null;
    }

    @Override
    public TR visit(VarDefinition v, TP param) {
        v.accept(this, param);
        return null;
    }

    @Override
    public TR visit(FunctionDefinition f, TP param) {
        f.accept(this, param);
        return null;
    }

    @Override
    public TR visit(Assignment a, TP param) {
        a.getLeft().accept(this, param);
        a.getRight().accept(this, param);
        return null;
    }

    @Override
    public TR visit(IfElse i, TP param) {
        i.getCondition().accept(this, param);
        i.getTrueStatements().stream().forEach( t -> t.accept(this, param));
        i.getFalseStatements().stream().forEach( t-> t.accept(this, param));
        return null;
    }

    @Override
    public TR visit(Read r, TP param) {
        r.getExpression().stream().forEach( e -> e.accept(this, param));
        return null;
    }

    @Override
    public TR visit(Return r, TP param) {
        r.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(While w, TP param) {
        w.getExpression().accept(this, param);
        w.getStatements().stream().forEach( s -> s.accept(this, param));
        return null;
    }

    @Override
    public TR visit(Write w, TP param) {
        w.getExpression().stream().forEach( e -> e.accept(this, param));
        return null;
    }

    @Override
    public TR visit(Arithmetic a, TP param) {
        a.getLeft().accept(this, param);
        a.getRight().accept(this, param);
        return null;
    }

    @Override
    public TR visit(ArrayAccess a, TP param) {
        a.getLeft().accept(this, param);
        a.getRight().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Cast c, TP param) {
        c.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Comparasion c, TP param) {
        c.getLeft().accept(this, param);
        c.getRight().accept(this, param);

        return null;
    }

    @Override
    public TR visit(FieldAccess f, TP param) {
        f.getLeft().accept(this, param);
        return null;
    }

    @Override
    public TR visit(FunctionInvocation f, TP param) {
        f.getName().accept(this, param);
        f.getParameters().stream().forEach( p -> p.accept(this, param));
        return null;
    }

    @Override
    public TR visit(Logic l, TP param) {
        l.getLeft().accept(this, param);
        l.getRight().accept(this, param);
        return null;
    }

    @Override
    public TR visit(UnaryMinus u, TP param) {
        u.getRight().accept(this, param);
        return null;
    }

    @Override
    public TR visit(UnaryNot u, TP param) {
        u.getRight().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Variable v, TP param) {
        return null;
    }

    @Override
    public TR visit(CharLiteral c, TP param) {
        return null;
    }

    @Override
    public TR visit(IntLiteral i, TP param) {
        return null;
    }

    @Override
    public TR visit(FloatLiteral f, TP param) {
        return null;
    }

    @Override
    public TR visit(ArrayType i, TP param) {
        i.getArrayType().accept(this, param);
        return null;
    }

    @Override
    public TR visit(CharType i, TP param) {
        return null;
    }

    @Override
    public TR visit(ErrorType i, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionType i, TP param) {
        i.getParameters().stream().forEach(p -> p.accept(this, param));
        i.getReturnType().accept(this, param);
        return null;
    }

    @Override
    public TR visit(FloatType i, TP param) {
        return null;
    }

    @Override
    public TR visit(StructType i, TP param) {
        i.getFields().stream().forEach( s -> s.accept(this, param));
        return null;
    }

    @Override
    public TR visit(StructField i, TP param) {
        i.accept(this, param);
        return null;
    }

    @Override
    public TR visit(VoidType i, TP param) {
        return null;
    }

    @Override
    public TR visit(IntType i, TP o) {
        return null;
    }
}
