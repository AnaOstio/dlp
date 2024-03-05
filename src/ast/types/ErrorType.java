package ast.types;

public class ErrorType implements Type {

    private String message;
    private int line, col;

    public ErrorType(String message, int line, int col){
        this.message = message;
        this.col = col;
        this.line = line;
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
