package ast.expressions;

import visitor.Visitor;

public class FieldAccess extends AbstractExpression {
    private Expression left;
    private String id;

    public FieldAccess(int line, int column, Expression left, String id) {
        super(line, column);
        this.left = left;
        this.id = id;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public String getRight() {
        return id;
    }

    public void setRight(String right) {
        this.id = right;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }
}
