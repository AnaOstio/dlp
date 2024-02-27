package ast.statements;

import ast.expressions.Expression;

// TODO revisar este
public class Read extends AbstractStatement {

    private Expression expression;

    public Read(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}