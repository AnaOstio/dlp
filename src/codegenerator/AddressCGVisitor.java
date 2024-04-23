package codegenerator;

import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Variable;

public class AddressCGVisitor extends AbstractCGVisitor<FunctionDefinition, Void>{
    public AddressCGVisitor(CodeGenerator codeGenerator) {
        super(codeGenerator);
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
            getCodeGenerator().pusha(((VarDefinition) v.getDefinition()).getOffset());
        } else {
            getCodeGenerator().push(((VarDefinition) v.getDefinition()).getOffset());
            getCodeGenerator().pushBP();
            getCodeGenerator().operation("addi" , null);
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
}
