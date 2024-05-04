package codegenerator;

import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.ArrayAccess;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;
import ast.types.StructType;

public class AddressCGVisitor extends AbstractCGVisitor<FunctionDefinition, Void>{

    private ValueCGVisitor vv;
    private CodeGenerator cg;

    public AddressCGVisitor(CodeGenerator codeGenerator) {
        this.cg = codeGenerator;
    }

    public void setValueVisitor(ValueCGVisitor vv){
        this.vv = vv;
    }

    /*
        [Variable: expresion -> ID:string]() =
            if expresion.definirion.scope == 0
                <pusha> expresion.definition.offset
            else
                <pushi> expresion.definition.offset
                <push> BP
                <addi>
     */
    @Override
    public Void visit(Variable v, FunctionDefinition param) {
        if(v.getDefinition().getScope() == 0) {
            this.cg.pusha(((VarDefinition) v.getDefinition()).getOffset());
        } else {
            this.cg.push(((VarDefinition) v.getDefinition()).getOffset());
            this.cg.pushBP();
            this.cg.operation("addi" , null);
        }
        return null;
    }

    /*
        [ArrayAccess: expresion -> expresion1 expresion2]() =
            addres[expresion1]
            value[expresion2]
            <pushi> expr1.type.numberOfBytes()
            <muli>
            <addi>
     */
    @Override
    public Void visit(ArrayAccess a, FunctionDefinition param) {
        a.getLeft().accept(this, param);
        a.getRight().accept(vv, param);
        this.cg.push(a.getType().numberOfBytes());
        this.cg.operation("muli", null);
        this.cg.operation("addi", null);
        return null;
    }

    /*
        [FieldAccess: expresion -> expresion1 ID]() =
            addres[expresion1]
            <pushi> expr.type.getField(expr1.fieldName).offset
            <addi>
     */
    @Override
    public Void visit(FieldAccess f, FunctionDefinition param) {
        f.getLeft().accept(this, param);
        this.cg.push(((StructType)f.getLeft().getType()).searchField(f.getRight()).getOffset());
        this.cg.operation("addi", null);
        return null;
    }
}
