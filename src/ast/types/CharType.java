package ast.types;

public class CharType extends AbstractType {

    private static CharType instance;

    public CharType() {
        super(0, 0);
    }

    public static CharType getInstance() {
        if (instance == null){
            instance = new CharType();
        }
        return instance;
    }

    public static void setInstance(CharType instance) {
        CharType.instance = instance;
    }
}