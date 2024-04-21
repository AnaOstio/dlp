package codegenerator;

import ast.definitions.FunctionDefinition;

public class AddressCGVisitor extends AbstractCGVisitor<FunctionDefinition, Void>{
    public AddressCGVisitor(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }
}
