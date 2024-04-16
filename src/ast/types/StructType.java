package ast.types;

import ast.ASTNode;
import ast.definitions.VarDefinition;
import visitor.Visitor;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }

    /*
     *  COMPROBACIÓN DE TIPOS
     */

    @Override
    public Type dot(String structField, ASTNode node) {
        for(StructField s: fields){
            if(s.getName().equals(structField))
                return s.getType();
        }
        return super.dot(structField, node);
    }

    @Override
    public int numberOfBytes() {
        int aux = 0;
        for(StructField s: fields){
            aux += s.getType().numberOfBytes();
        }
        return aux;
    }
}
