package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class MultipleAssignment extends AbstractStatement {

    private List<Expression> left, right;

    public MultipleAssignment(int line, int column, List<Expression> left, List<Expression> right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    public List<Expression> getLeft() {
        return left;
    }

    public void setLeft(List<Expression> left) {
        this.left = left;
    }

    public List<Expression> getRight() {
        return right;
    }

    public void setRight(List<Expression> right) {
        this.right = right;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }

    @Override
    public String toString() {
        return left.toString() + " = " + right.toString();
    }
}
