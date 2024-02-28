package ast.definitions;

import ast.expressions.Expression;
import ast.expressions.Variable;
import ast.statements.Statement;
import ast.types.Type;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

    private List<Statement> body;

    public FunctionDefinition(int line, int column, Type type,  String name, List<Statement> body) {
        super(line, column, type, name);
        this.body = body;
    }

    public List<Statement> getBody() {
        return body;
    }

    public void setBody(List<Statement> body) {
        this.body = body;
    }
}
