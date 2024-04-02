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
        return null;
    }

    @Override
    public Type arithmetic(ASTNode node) {
        return null;
    }

    @Override
    public Type compression(Type expressionType, ASTNode node) {
        return null;
    }

    @Override
    public Type logical(Type expressionType, ASTNode node) {
        return null;
    }

    @Override
    public Type logical(ASTNode node) {
        return null;
    }

    @Override
    public Type parenthesis(List<Type> expressionList, ASTNode node) {
        return null;
    }

    @Override
    public Type canBeCastTo(Type exprToCast, ASTNode node) {
        return null;
    }

    @Override
    public Type brackets(Type expressionType, ASTNode node) {
        return null;
    }

    @Override
    public Type dot(String structField, ASTNode node) {
        return null;
    }

    @Override
    public Type mustPromotesTo(Type expression, ASTNode node) {
        return null;
    }

    @Override
    public boolean isBuiltIn() {
        return false;
    }
}
