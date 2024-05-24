package ast.expressions;

import visitor.Visitor;

public class Pow extends AbstractExpression {

    private Expression left, rigth;

    public Pow(int line, int column, Expression left, Expression rigth) {
        super(line, column);
        this.left = left;
        this.rigth = rigth;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRigth() {
        return rigth;
    }

    public void setRigth(Expression rigth) {
        this.rigth = rigth;
    }
}
