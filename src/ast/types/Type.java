package ast.types;

import ast.ASTNode;
import ast.expressions.Expression;

import java.util.List;

public interface Type extends ASTNode {

    boolean isLogic(ASTNode node);
    Type arithmetic(Type expressionType, ASTNode node);
    Type arithmetic(ASTNode node);
    Type comparison(Type expressionType, ASTNode node);
    Type logical(Type expressionType, ASTNode node);
    Type logical(ASTNode node);
    Type parenthesis(List<Type> expressionList, ASTNode node);
    Type canBeCastTo(Type exprToCast, ASTNode node);
    Type brackets(Type expressionType, ASTNode node);
    Type dot(String structField, ASTNode node);
    Type mustPromotesTo(Type expression, ASTNode node);
    boolean isBuiltIn();
    int numberOfBytes();
}
