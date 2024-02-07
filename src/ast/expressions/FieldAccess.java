package ast.expressions;

public class FieldAccess extends AbstractExpression{

    private String field;
    private Expression expression;

    public FieldAccess(int line, int column, String field, Expression expression) {
        super(line, column);
        this.field = field;
        this.expression = expression;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
