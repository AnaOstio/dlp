package ast.statements;

import ast.expressions.AbstractExpression;
import ast.expressions.Expression;
import ast.types.Type;
import visitor.Visitor;

public class Assignment extends AbstractExpression implements Statement {

    private Expression left, right;

    public Assignment(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }

    @Override
    public String toString() {
        return left.toString() + " = " + right.toString();
    }

    @Override
    public boolean getLValue() {
        return right.getLValue();
    }
}
