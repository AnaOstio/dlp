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
        if( expressionType.isBuiltIn())
            return expressionType;
        return super.arithmetic(expressionType, node);
    }

    @Override
    public Type arithmetic(ASTNode node) {
        return this;
    }

    @Override
    public Type comparison(Type expressionType, ASTNode node) {
        if( expressionType.isBuiltIn() )
            return IntType.getInstance();
        else
            return super.comparison(expressionType, node);
    }

    @Override
    public Type mustPromotesTo(Type expression, ASTNode node) {
        if( expression.isBuiltIn())
            return expression;
        else
            return super.mustPromotesTo(expression, node);
    }

    @Override
    public Type canBeCastTo(Type exprToCast, ASTNode node) {
        if( exprToCast.isBuiltIn())
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
