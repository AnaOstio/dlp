package ast.types;

import ast.ASTNode;
import visitor.Visitor;

import javax.lang.model.type.ErrorType;

public class CharType extends AbstractType {

    private static CharType instance;

    public CharType() {
        super(0, 0);
    }

    public static CharType getInstance() {
        if (instance == null){
            instance = new CharType();
        }
        return instance;
    }

    public static void setInstance(CharType instance) {
        CharType.instance = instance;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }

    /*
     *  COMPROBACIÓN DE TIPOS
     */

    @Override
    public boolean isLogic(ASTNode node) {
        return super.isLogic(node);
    }

    @Override
    public Type arithmetic(Type expressionType, ASTNode node) {
        if(this == expressionType)
            return IntType.getInstance();
        if (expressionType instanceof ErrorType)
            return expressionType;
        return super.arithmetic(expressionType, node);
    }

    @Override
    public Type arithmetic(ASTNode node) {
        return this;
    }

    @Override
    public Type compression(Type expressionType, ASTNode node) {
        if(this == expressionType)
            return IntType.getInstance();
        if (expressionType instanceof ErrorType)
            return expressionType;
        return super.compression(expressionType, node);
    }

    @Override
    public Type canBeCastTo(Type exprToCast, ASTNode node) {
        if( exprToCast.isBuiltIn() || exprToCast instanceof ast.types.ErrorType)
            return exprToCast;
        return super.canBeCastTo(exprToCast, node);
    }

    @Override
    public Type mustPromotesTo(Type expression, ASTNode node) {
        if( this.equals(expression) || expression instanceof ast.types.ErrorType)
            return expression;
        else
            return super.mustPromotesTo(expression, node);
    }

    @Override
    public boolean isBuiltIn() {
        return true;
    }
}
