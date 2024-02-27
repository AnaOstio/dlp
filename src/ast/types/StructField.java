package ast.types;

import ast.AbstractASTNode;

public class StructField extends AbstractASTNode  {

    private Type type;
    private String name;

    public StructField(int line, int column, Type type, String name) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}