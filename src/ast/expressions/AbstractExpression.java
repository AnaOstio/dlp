package ast.expressions;

import ast.AbstractASTNode;
import ast.types.Type;
import visitor.Visitor;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {

    private Type type;
    private boolean lvalue;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean getLValue() {
        return false;
    }

    @Override
    public void setLValue(boolean lvalue) {
        this.lvalue = lvalue;
    }
}
