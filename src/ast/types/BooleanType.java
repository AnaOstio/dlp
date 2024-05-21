package ast.types;

import ast.ASTNode;
import visitor.Visitor;

public class BooleanType extends AbstractType {

    private static BooleanType instance;

    public BooleanType() {
        super(0, 0);
    }

    public static BooleanType getInstance() {
        if (instance == null){
            instance = new BooleanType();
        }
        return instance;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return null;
    }


    /*
            * CODE GENERATOR
     */
    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public String suffix() {
        return "i";
    }

    @Override
    public String toString() {
        return "Boolean";
    }

    /*
        COMPROBACION DE TIPOS
     */

    @Override
    public boolean isLogic(ASTNode node) {
        return true;
    }

    @Override
    public Type mustPromotesTo(Type expression, ASTNode node) {
        if( this.equals(expression) || expression instanceof ErrorType )
            return expression;
        else
            return super.mustPromotesTo(expression, node);
    }

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
    public boolean isBuiltIn() {
        return true;
    }
}
