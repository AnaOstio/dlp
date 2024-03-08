package ast.types;

import ast.definitions.VarDefinition;

import java.util.List;

public class StructType extends AbstractType {

    private List<StructField> fields;

    public StructType(int line, int column, List<StructField> fields) {
        super(line, column);
        this.fields = fields;
    }

    public List<StructField> getFields() {
        return fields;
    }

    public void setFields(List<StructField> fields) {
        this.fields = fields;
    }
}
