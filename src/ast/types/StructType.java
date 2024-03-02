package ast.types;

import ast.definitions.VarDefinition;

import java.util.List;

public class StructType extends AbstractType {

    private List<VarDefinition> fields;

    public StructType(int line, int column, List<VarDefinition> fields) {
        super(line, column);
        this.fields = fields;
    }

    public List<VarDefinition> getFields() {
        return fields;
    }

    public void setFields(List<VarDefinition> fields) {
        this.fields = fields;
    }
}
