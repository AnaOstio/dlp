package errorhandler;

import java.io.OutputStreamWriter;
import java.util.List;

public class ErrorHandler {

    private List<ErrorHandler> list;
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
}
