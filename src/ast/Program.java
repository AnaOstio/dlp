package ast;

import ast.definitions.Definition;
import visitor.Visitor;

import java.util.List;

public class Program extends  AbstractASTNode{

    private List<Definition> body;

    public Program(int line, int column, List<Definition> body) {
        super(line, column);
        this.body = body;
    }

    public List<Definition> getBody() {
        return body;
    }

    public void setBody(List<Definition> body) {
        this.body = body;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }
}
