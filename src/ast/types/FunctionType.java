package ast.types;

import ast.ASTNode;
import ast.definitions.VarDefinition;
import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractType {

    private Type returnType;
    private List<VarDefinition> parameters;

    private int parametersBytes;

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

    public int getParametersBytes() {
        return parametersBytes;
    }

    public void setParametersBytes(int parametersBytes) {
        this.parametersBytes = parametersBytes;
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
        if( parameters.size() != expressionList.size())
            return new ErrorType("El número de parametros es incorrecto", node.getLine(), node.getColumn());

        int j = parameters.size()-1;
        for (int i=0; i < parameters.size(); i++) {
            if (!expressionList.get(i).getClass().equals(parameters.get(j).getType().getClass())) {
                if (expressionList.get(i) instanceof ErrorType) {
                    return expressionList.get(i);
                }
                return new ErrorType("El tipo del parámetro no coincide con el de la definición", node.getLine(), node.getColumn());
            }
            j--;
        }
        return returnType;
    }

    @Override
    public int numberOfBytes() {
        int total = 0;
        for(VarDefinition p: parameters){
            total += p.getType().numberOfBytes();
        }
        return total;
    }
}
