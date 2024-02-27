package ast.statements;

import ast.expressions.Expression;

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
}
