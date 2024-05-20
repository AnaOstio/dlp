package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class Read extends AbstractStatement {

    private List<Expression> expression;

    public Read(int line, int column, List<Expression> expression) {
        super(line, column);
        this.expression = expression;
    }

    public List<Expression> getExpression() {
        return expression;
    }

    public void setExpression(List<Expression> expression) {
        this.expression = expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("read ");

        for (int i = 0; i < expression.size() - 1; i++) {
            if (i != expression.size() - 1) {
                sb.append(expression.get(i).toString() + ",");
            } else {
                sb.append(expression.get(i).toString() + ";");
            }
        }

        return sb.toString();
    }
}
