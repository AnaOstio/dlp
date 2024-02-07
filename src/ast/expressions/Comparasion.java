package ast.expressions;

public class Comparasion extends AbstractExpression {

    private Expression left, right;
    private String operator;

    public Comparasion(int line, int column, Expression left, Expression right, String operator) {
        super(line, column);
        this.left = left;
        this.right = right;
        this.operator = operator;
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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
