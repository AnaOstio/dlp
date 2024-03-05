package errorhandler;

import ast.types.ErrorType;

import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

    private List<ErrorType> list;
    private static ErrorHandler errorHandler;

    public ErrorHandler(){
        this.list = new ArrayList<>();
    }

    public static ErrorHandler getInstance(){
        if (errorHandler == null){
            errorHandler = new ErrorHandler();
        }
        return errorHandler;
    }

    public boolean anyError(){
        return list.size() == 0;
    }

    public void showErrors(PrintStream ps) {
        list.stream().forEach( l -> ps.println(l));
    }

    public void addError(ErrorType error) {
        // Compruebo que no se añade mas de una vez el mismo error
        if (!list.contains(error)) list.add(error);
    }
}
