package ast.expressions;

import ast.statements.Statement;
import visitor.Visitor;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + "(");

        for(int i = 0; i < parameters.size() - 1; i++){
            if( i != parameters.size() - 1){
                sb.append(parameters.get(i).toString() + ",");
            } else {
                sb.append(parameters.get(i).toString());
            }
        }

        sb.append(")");

        return sb.toString();
    }
}
