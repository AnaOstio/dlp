package errorhandler;

import java.io.OutputStreamWriter;
import java.util.List;

public class ErrorHandler {

    private List<ErrorType> list;
    private static ErrorHandler errorHandler;

    public ErrorHandler getInstance(){
        if (errorHandler == null){
            errorHandler = new ErrorHandler();
        }
        return errorHandler;
    }

    public boolean anyError(){
        return list.size() == 0;
    }

    public void showErrors(OutputStreamWriter osw){
    }

    public void addError(ErrorType error){
        this.list.add(error);
    }
}
