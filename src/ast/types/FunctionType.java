package ast.types;

import ast.ASTNode;
import ast.definitions.VarDefinition;
import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractType {

    private Type returnType;
    private List<VarDefinition> parameters;

    public FunctionType(int line, int column, Type returnType, List<VarDefinition> parameters) {
        super(line, column);
        this.returnType = returnType;
        this.parameters = parameters;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public List<VarDefinition> getParameters() {
        return parameters;
    }

    public void setParameters(List<VarDefinition> parameters) {
        this.parameters = parameters;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }

    /*
     *   COMPROBACIÓN DE TIPOS
     */

    @Override
    public Type parenthesis(List<Type> expressionList, ASTNode node) {
        if( this.getParameters().size() != expressionList.size())
            return new ErrorType("El número de parametros es incorrecto", node.getLine(), node.getColumn());

        for (int i = 0; i < expressionList.size(); i++){
            if(getParameters().get(i).getType() != expressionList.get(i)) {
                // Aqui solo entrara si el tipo de es de ErrorType
                if(expressionList.get(i) instanceof ErrorType)
                    return expressionList.get(i);
                else
                    return new ErrorType("El tipo de los parametros no coinciden con su definicion", node.getLine(), node.getColumn());
            }
        }
        return this;
    }
}
