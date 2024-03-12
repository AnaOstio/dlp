package ast.types;

import ast.AbstractASTNode;
import visitor.Visitor;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }
}
