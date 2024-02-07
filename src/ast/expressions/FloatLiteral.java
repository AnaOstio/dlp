package ast.expressions;

public class FloatLiteral extends AbstractExpression {

    private float value;

    public FloatLiteral(int line, int column, float value) {
        super(line, column);
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
