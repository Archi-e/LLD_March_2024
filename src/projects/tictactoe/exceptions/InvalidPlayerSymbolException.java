package projects.tictactoe.exceptions;

public class InvalidPlayerSymbolException extends RuntimeException{
    public InvalidPlayerSymbolException() {
    }

    public InvalidPlayerSymbolException(String message) {
        super(message);
    }

    public InvalidPlayerSymbolException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPlayerSymbolException(Throwable cause) {
        super(cause);
    }

    public InvalidPlayerSymbolException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
