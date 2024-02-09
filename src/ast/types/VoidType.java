package ast.types;

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
}
