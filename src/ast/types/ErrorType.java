package ast.types;

public class ErrorType extends AbstractType {

    private String message;
    private int line, col;

    public ErrorType(String message, int line, int col){
        super(line, col);
        this.message = message;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return col;
    }
}
