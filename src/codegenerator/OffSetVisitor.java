package codegenerator;

import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.statements.Statement;
import ast.types.FunctionType;
import visitor.AbstractVisitor;

public class OffSetVisitor extends AbstractVisitor<Void, Void> {

    private int localOffset = 0;

    @Override
    public Void visit(FunctionDefinition f, Void param) {
        localOffset = 0;
        f.getType().accept(this, param);
        for (Statement s: f.getBody()) {
            if(s instanceof VarDefinition)
                s.accept(this, param);
        }
        f.setLocalBytes( -1 *  localOffset);
        return super.visit(f, param);
    }

    @Override
    public Void visit(VarDefinition v, Void param) {
        // Si es variable global
        if (v.getScope() == 0) {

        } else {

        }
        return super.visit(v, param);
    }

    @Override
    public Void visit(FunctionType i, Void param) {
        int offset = 4;
        // Hay que recorrerlo al reves
        for(int aux = i.getParameters().size() -1;  aux >= 0; aux--){
            VarDefinition v = i.getParameters().get(aux);
            v.setOffset(offset);
            offset += v.getType().numberOfBytes();
        }
        return null;
    }
}
