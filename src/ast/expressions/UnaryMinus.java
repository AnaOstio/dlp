package ast.expressions;

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
}
