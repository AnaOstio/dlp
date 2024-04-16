package ast.types;

import ast.AbstractASTNode;
import visitor.Visitor;

public class StructField extends AbstractASTNode  {

    private Type type;
    private String name;

    private int offset;

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

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }
}
