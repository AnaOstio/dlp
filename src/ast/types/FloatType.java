package ast.types;

import visitor.Visitor;

public class FloatType extends AbstractType {

    private static FloatType instance;

    public FloatType() {
        super(0, 0);
    }

    public static FloatType getInstance() {
        if (instance == null){
            instance = new FloatType();
        }
        return instance;
    }

    public static void setInstance(FloatType instance) {
        FloatType.instance = instance;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }
}
