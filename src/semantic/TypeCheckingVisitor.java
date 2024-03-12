package semantic;

import ast.Program;
import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import visitor.AbstractVisitor;
import visitor.Visitor;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {
    @Override
    public Void visit(Assignment a, Void param) {
        a.getLeft().accept(this, param);
        a.getRight().accept(this, param);

        if(!a.getLeft().getLValue())
            new ErrorType("No se puede realizar la asignacion", a.getLine(), a.getColumn());
        return null;
    }

    @Override
    public Void visit(Read r, Void param) {
        for (Expression e:  r.getExpression()){
            e.accept(this, param);
            if(!e.getLValue()){
                new ErrorType("La expresión " + e.toString() + " no se puede usar en un Read", e.getLine(), e.getColumn());
            }
        }
        return null;
    }

    @Override
    public Void visit(Arithmetic a, Void param) {
        a.getLeft().accept(this, param);
        a.getRight().accept(this, param);

        a.setLValue(true);
        return null;
    }

    @Override
    public Void visit(ArrayAccess a, Void param) {
        a.getLeft().accept(this, param);
        a.getRight().accept(this, param);

        a.setLValue(true);
        return null;
    }

    @Override
    public Void visit(Cast c, Void param) {
        c.getExpression().accept(this, param);

        c.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Comparasion c, Void param) {
        c.getLeft().accept(this, param);
        c.getRight().accept(this, param);

        c.setLValue(false);
        return null;
    }

    @Override
    public Void visit(FieldAccess f, Void param) {
        return null;
    }

    @Override
    public Void visit(FunctionInvocation f, Void param) {
        for(Expression e: f.getParameters()){
            e.accept(this, param);
        }

        f.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Logic l, Void param) {
        l.getLeft().accept(this, param);
        l.getRight().accept(this, param);

        l.setLValue(false);
        return null;
    }

    @Override
    public Void visit(UnaryMinus u, Void param) {
        u.getRight().accept(this, param);

        u.setLValue(false);
        return null;
    }

    @Override
    public Void visit(UnaryNot u, Void param) {
        u.getRight().accept(this, param);

        u.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Variable v, Void param) {
        v.setLValue(true);
        return null;
    }

    @Override
    public Void visit(CharLiteral c, Void param) {
        c.setLValue(false);
        return null;
    }

    @Override
    public Void visit(IntLiteral i, Void param) {
        i.setLValue(false);
        return null;
    }

    @Override
    public Void visit(FloatLiteral f, Void param) {
        f.setLValue(false);
        return null;
    }
}
