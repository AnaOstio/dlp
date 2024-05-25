package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;
import java.util.Map;

public class Switch extends AbstractStatement{

    Expression condition;
    Map<Expression, List<Statement>> cases;
    List<Statement> defaultCases;

    public Switch(int line, int column, Expression condition, Map<Expression, List<Statement>> cases, List<Statement> defaultCases) {
        super(line, column);
        this.cases = cases;
        this.condition = condition;
        this.defaultCases = defaultCases;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return null;
    }
}
