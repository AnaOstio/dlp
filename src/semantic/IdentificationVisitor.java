package semantic;

import ast.definitions.Definition;
import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Variable;
import ast.types.ErrorType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

    private SymbolTable st = new SymbolTable();

    @Override
    public Void visit(VarDefinition v, Void param) {
        if (!st.insert(v))
            new ErrorType("La variable " + v.getName() + " ya está definida", v.getLine(), v.getColumn());
        return null;
    }

    @Override
    public Void visit(FunctionDefinition f, Void param) {
        if (!st.insert(f))
            new ErrorType("La función " + f.getName() + " ya está definida", f.getLine(), f.getColumn());
        st.set();
        super.visit(f, param);
        st.reset();
        return null;
    }

    @Override
    public Void visit(Variable v, Void param) {

        Definition d = st.find(v.getName());
        if(d == null) {
            v.setDefinition(new VarDefinition(v.getLine(), v.getColumn(), new ErrorType("La variable " + v.getName() + " no esta definida",
                    v.getLine(), v.getColumn()), v.getName()));
        } else{
            v.setDefinition(d);
        }

        return null;
    }
}
