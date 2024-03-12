package ast.types;

import errorhandler.ErrorHandler;
import visitor.Visitor;

public class ErrorType extends AbstractType {

    private String message;

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
        return column;
    }

    @Override
    public String toString() {
        return "Error: " + message + " [line: " + line + ", col: " + column + "]";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }
}
