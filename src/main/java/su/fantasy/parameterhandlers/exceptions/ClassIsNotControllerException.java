package su.fantasy.parameterhandlers.exceptions;

public class ClassIsNotControllerException extends RuntimeException{

    public ClassIsNotControllerException() {
    }

    public ClassIsNotControllerException(String message) {
        super(message);
    }
}
