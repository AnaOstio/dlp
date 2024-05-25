package ast.statements;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class CaseStatement extends AbstractASTNode {

    private Expression condition;
    private List<Statement> statementList;

    public CaseStatement(int line, int column, Expression condition, List<Statement> statementList) {
        super(line, column);
        this.condition = condition;
        this.statementList = statementList;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return null;
    }
}
