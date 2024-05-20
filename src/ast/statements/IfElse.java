package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("if (" + condition.toString() + ") {\n");
        for (int i = 0; i < trueStatements.size() - 1; i++){
            sb.append("\n\t" + trueStatements.get(i).toString());
        }
        sb.append("\n}");

        if(falseStatements.size() > 0){
            sb.append("else {");
            for (int i = 0; i < falseStatements.size() - 1; i++){
                sb.append("\n\t" + falseStatements.get(i).toString());
            }

            sb.append("\n}");
        }

        return sb.toString();
    }
}
