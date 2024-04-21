package codegenerator;

import ast.definitions.FunctionDefinition;

public class ValueCGVisitor extends AbstractCGVisitor<FunctionDefinition, Void>{

    public ValueCGVisitor(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }
}
