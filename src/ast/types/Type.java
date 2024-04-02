package ast.types;

import ast.ASTNode;
import ast.expressions.Expression;

import java.util.List;

public interface Type extends ASTNode {

    /**
     * Comprueba si en ciertos casos son lógicos, es decir nos sirve para comprobar condiciones de cosas
     * @return True si es de tipo INT, False en caso contrario (ver si es con tipos simples o q)
     */
    boolean isLogic(ASTNode node);
    Type arithmetic(Type expressionType, ASTNode node);

    /**
     * Este nos sirve para los tipos unarios
     * @return
     */
    Type arithmetic(ASTNode node);

    /**
     * va a necesitar un ASTNode para el tema del error
     * @param expressionType
     * @return
     */
    Type compression(Type expressionType, ASTNode node);

    /**
     * va a necesitar un ASTNode para el tema del error
     * @param expressionType
     * @return
     */
    Type logical(Type expressionType, ASTNode node);

    Type logical(ASTNode node);

    Type parenthesis(List<Type> expressionList, ASTNode node);

    /**
     * Este metodo de aqui tiene que comprobar cuales
     */
    Type canBeCastTo(Type exprToCast, ASTNode node);

    /**
     * Comprueba si los tipos para los array es correcto
     * @param expressionType
     * @return
     */
    Type brackets(Type expressionType, ASTNode node);

    Type dot(String structField, ASTNode node);

    Type mustPromotesTo(Type expression, ASTNode node);

    /**
     * Este método de aquí nos dirá si un tipo es de tipo simple o 'casteable'
     * @return
     */
    boolean isBuiltIn();
}
