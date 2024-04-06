package ast.types;

import ast.ASTNode;
import ast.AbstractASTNode;
import ast.expressions.Expression;

import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean isLogic(ASTNode node) {
        return false;
    }

    @Override
    public Type arithmetic(Type expressionType, ASTNode node) {
        return new ErrorType("No se puede realizar la operación aritmética",node.getLine(), node.getColumn());
    }

    @Override
    public Type arithmetic(ASTNode node) {
        return new ErrorType("No se puede realizar la operación aritmética",node.getLine(), node.getColumn());
    }

    @Override
    public Type compression(Type expressionType, ASTNode node) {
        return new ErrorType("No se puede realizar la comparacion",node.getLine(), node.getColumn());
    }

    @Override
    public Type logical(Type expressionType, ASTNode node) {
        return new ErrorType("No se puede realizar la comparación lógica",node.getLine(), node.getColumn());
    }

    @Override
    public Type logical(ASTNode node) {
        return new ErrorType("No se puede realizar la comparación lógica",node.getLine(), node.getColumn());
    }

    @Override
    public Type parenthesis(List<Type> expressionList, ASTNode node) {
        return new ErrorType("No se puede evaluar la expresion",node.getLine(), node.getColumn());
    }

    @Override
    public Type canBeCastTo(Type exprToCast, ASTNode node) {
        return new ErrorType("No se puede realizar el cast",node.getLine(), node.getColumn());
    }

    @Override
    public Type brackets(Type expressionType, ASTNode node) {
        return new ErrorType("No se puede acceder al array",node.getLine(), node.getColumn());
    }

    @Override
    public Type dot(String structField, ASTNode node) {
        return new ErrorType("No se puede acceder a la propiedad",node.getLine(), node.getColumn());
    }

    @Override
    public Type mustPromotesTo(Type expression, ASTNode node) {
        return new ErrorType("Los tipos no son compatibles",node.getLine(), node.getColumn());
    }

    @Override
    public boolean isBuiltIn() {
        return false;
    }
}
