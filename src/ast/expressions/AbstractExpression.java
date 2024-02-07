package ast.expressions;

import ast.AbstractASTNode;
import ast.types.Type;

public class AbstractExpression extends AbstractASTNode implements Expression {

    private Type type;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
