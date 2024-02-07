package ast.definitions;

import ast.types.Type;

public class VarDefinition extends AbstractDefinition {

    private int offset;

    public VarDefinition(int line, int column, Type type, int scope, String name) {
        super(line, column, type, scope, name);
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
