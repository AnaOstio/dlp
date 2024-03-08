package ast.types;

import errorhandler.ErrorHandler;

public class ErrorType extends AbstractType {

    private String message;
    private int line, col;

    public ErrorType(String message, int line, int col){
        super(line, col);
        this.message = message;

        // Tenemos que añadir el error a la lista que corresponda
        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return col;
    }

    @Override
    public String toString() {
        return "Error: " + message + " [line: " + line + ", col: " + col + "]";
    }
}
