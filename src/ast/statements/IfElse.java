package ast.statements;

import ast.expressions.Expression;

import java.util.List;

public class IfElse extends AbstractStatement {

    private Expression condition;
    private List<Statement> trueStatements, falseStatements;


    public IfElse(int line, int column, Expression condition, List<Statement> trueStatements, List<Statement> falseStatements) {
        super(line, column);
        this.condition = condition;
        this.trueStatements = trueStatements;
        this.falseStatements = falseStatements;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public List<Statement> getTrueStatements() {
        return trueStatements;
    }

    public void setTrueStatements(List<Statement> trueStatements) {
        this.trueStatements = trueStatements;
    }

    public List<Statement> getFalseStatements() {
        return falseStatements;
    }

    public void setFalseStatements(List<Statement> falseStatements) {
        this.falseStatements = falseStatements;
    }
}
