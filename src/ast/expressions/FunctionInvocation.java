package ast.expressions;

import ast.statements.Statement;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {

    private Variable name;
    private List<Expression> parameters;

    public FunctionInvocation(int line, int column, Variable name, List<Expression> parameters) {
        super(line, column);
        this.name = name;
        this.parameters = parameters;
    }

    public Variable getName() {
        return name;
    }

    public void setName(Variable name) {
        this.name = name;
    }

    public List<Expression> getParameters() {
        return parameters;
    }

    public void setParameters(List<Expression> parameters) {
        this.parameters = parameters;
    }
}
