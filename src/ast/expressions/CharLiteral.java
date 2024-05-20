package ast.expressions;

import visitor.Visitor;

public class CharLiteral extends AbstractExpression {

    private char value;

    public CharLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }

    @Override
    public String toString() {
        switch (value) {
            case '\n':
                return "'\\n'";
            case '\r':
                return "'\\r'";
            case '\t':
                return "'\\t'";
            default:
                return  "'" + value + "'";
        }
    }
}
