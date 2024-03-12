package ast.types;

import visitor.Visitor;

public class VoidType extends AbstractType {

    private static VoidType instance;

    public VoidType() {
        super(0, 0);
    }

    public static VoidType getInstance() {
        if (instance == null){
            instance = new VoidType();
        }
        return instance;
    }

    public static void setInstance(VoidType instance) {
        VoidType.instance = instance;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }
}
