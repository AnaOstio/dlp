package ast.expressions;

import ast.types.Type;
import visitor.Visitor;

public class Cast extends AbstractExpression {

    private Type type;
    private Expression expression;

    public Cast(int line, int column, Type type, Expression expression) {
        super(line, column);
        this.type = type;
        this.expression = expression;
    }

    public Type getCastType() {
        return type;
    }

    public void setCastType(Type type) {
        this.type = type;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }
}
