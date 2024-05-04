package codegenerator;

import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.statements.Statement;
import ast.types.FunctionType;
import ast.types.StructField;
import ast.types.StructType;
import visitor.AbstractVisitor;

public class OffSetVisitor extends AbstractVisitor<Void, Void> {

    private int localOffset = 0, globalOffset = 0;

    @Override
    public Void visit(FunctionDefinition f, Void param) {
        localOffset = 0;
        f.getType().accept(this, param);
        for (Statement s: f.getBody()) {
            if(s instanceof VarDefinition)
                s.accept(this, param);
        }
        f.setLocalVariablesBytes( -1 *  localOffset);
        return null;
    }

    @Override
    public Void visit(VarDefinition v, Void param) {
        super.visit(v, param);
        if (v.getScope() == 0) {
            v.setOffset(globalOffset);
            globalOffset += v.getType().numberOfBytes();
        } else {
            localOffset += v.getType().numberOfBytes();
            v.setOffset(localOffset * -1);
        }
        return null;
    }

    @Override
    public Void visit(FunctionType i, Void param) {
        i.getReturnType().accept(this, param);
        int offset = 4;
        // Hay que recorrerlo al reves
        for(int aux = i.getParameters().size() -1;  aux >= 0; aux--){
            VarDefinition v = i.getParameters().get(aux);
            v.setOffset(offset);
            offset += v.getType().numberOfBytes();
        }
        i.setParametersBytes(offset);
        return null;
    }

    @Override
    public Void visit(StructType i, Void param) {
        super.visit(i, param);
        int fieldsOffset = 0;
        for (StructField s: i.getFields()){
            s.setOffset(fieldsOffset);
            fieldsOffset += s.getType().numberOfBytes();
        }
        return null;
    }
}
