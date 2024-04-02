package ast.types;

import ast.ASTNode;
import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class IntType extends AbstractType {

    private static IntType instance;

    public IntType() {
        super(0, 0 );
    }

    public static IntType getInstance() {
        if (instance == null){
            instance = new IntType();
        }
        return instance;
    }

    public static void setInstance(IntType instance) {
        IntType.instance = instance;
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
        return true;
    }

    @Override
    public Type arithmetic(Type expressionType, ASTNode node) {
        if( this.equals(expressionType) || expressionType instanceof ErrorType )
            return expressionType;
        else
            return super.arithmetic(expressionType, node);
    }

    @Override
    public Type arithmetic(ASTNode node) {
        return this;
    }

    @Override
    public Type compression(Type expressionType, ASTNode node) {
        if( this.equals(expressionType) || expressionType instanceof ErrorType )
            return expressionType;
        else
            return super.compression(expressionType, node);
    }

    @Override
    public Type logical(Type expressionType, ASTNode node) {
        if( this.equals(expressionType) || expressionType instanceof ErrorType )
            return expressionType;
        else
            return super.logical(expressionType, node);
    }

    @Override
    public Type logical(ASTNode node) {
        return this;
    }

    @Override
    public Type canBeCastTo(Type exprToCast, ASTNode node) {
        if( exprToCast.isBuiltIn() || exprToCast instanceof ErrorType)
            return exprToCast;
        return super.canBeCastTo(exprToCast, node);
    }

    @Override
    public Type mustPromotesTo(Type expression, ASTNode node) {
        if( this.equals(expression) || expression instanceof ErrorType )
            return expression;
        else
            return super.mustPromotesTo(expression, node);
    }

    @Override
    public boolean isBuiltIn() {
        return true;
    }
}
