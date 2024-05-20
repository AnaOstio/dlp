package ast.expressions;

import visitor.Visitor;

public class UnaryMinus extends AbstractExpression {

    private Expression right;

    public UnaryMinus(int line, int column, Expression right) {
        super(line, column);
        this.right = right;
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
        return "-" + right.toString();
    }
}
