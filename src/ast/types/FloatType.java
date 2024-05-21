package ast.types;

import ast.ASTNode;
import visitor.Visitor;

public class FloatType extends AbstractType {

    private static FloatType instance;

    public FloatType() {
        super(0, 0);
    }

    public static FloatType getInstance() {
        if (instance == null){
            instance = new FloatType();
        }
        return instance;
    }

    public static void setInstance(FloatType instance) {
        FloatType.instance = instance;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }

    /*
     *  COMPROBACIÓN DE TIPOS
     */

    @Override
    public Type arithmetic(Type expressionType, ASTNode node) {
        if( this.equals(expressionType) || expressionType instanceof ErrorType)
            return expressionType;
        return super.arithmetic(expressionType, node);
    }

    @Override
    public Type arithmetic(ASTNode node) {
        return this;
    }

    @Override
    public Type comparison(Type expressionType, ASTNode node) {
        if( this.equals(expressionType))
            return BooleanType.getInstance();
        else if (expressionType instanceof ErrorType )
            return expressionType;
        else
            return super.comparison(expressionType, node);
    }

    @Override
    public Type mustPromotesTo(Type expression, ASTNode node) {
        if( this.equals(expression) || expression instanceof ast.types.ErrorType)
            return expression;
        else
            return super.mustPromotesTo(expression, node);
    }

    public Type canBeCastTo(Type exprToCast, ASTNode node) {
        if( exprToCast.isBuiltIn()  && exprToCast != BooleanType.getInstance()|| exprToCast instanceof ErrorType)
            return exprToCast;
        return super.canBeCastTo(exprToCast, node);
    }

    /*
     * CODE GENERATOR
     */

    @Override
    public int numberOfBytes() {
        return 4;
    }

    @Override
    public boolean isBuiltIn() {
        return true;
    }

    @Override
    public String suffix() {
        return "f";
    }

    @Override
    public String toString() {
        return "Float32";
    }
}
