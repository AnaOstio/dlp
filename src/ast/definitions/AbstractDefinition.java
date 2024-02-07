package ast.definitions;

import ast.AbstractASTNode;
import ast.types.Type;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {

    private Type type;
    private int scope; // Para decir si es local o cosas asi
    private String name;

    public AbstractDefinition(int line, int column, Type type, int scope, String name) {
        super(line, column);
        this.type = type;
        this.scope = scope;
        this.name = name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public int getScope() {
        return scope;
    }

    @Override
    public void setScope(int scope) {
        this.scope = scope;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
