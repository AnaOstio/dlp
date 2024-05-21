package ast.expressions;

import visitor.Visitor;

public class BooleanLiteral extends AbstractExpression {

    private int value;

    public BooleanLiteral(int line, int column, boolean value) {
        super(line, column);
        checkValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    private void checkValue(boolean value){
        if(value) this.value = 1;
        else this.value = 0;
    }
}
