package ast.types;

public class IntType extends AbstractType {

    private static IntType instance;

    public IntType() {
        super(0, 0 );
    }

    public static IntType getInstance() {
        if (instance == null){
            instance = new IntType();
        }
        return instance;
    }

    public static void setInstance(IntType instance) {
        IntType.instance = instance;
    }
}
