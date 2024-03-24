package projects.parkingLot.exceptions;

public class GateIdNotFoundException extends RuntimeException{
    public GateIdNotFoundException() {
    }

    public GateIdNotFoundException(String message) {
        super(message);
    }

    public GateIdNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public GateIdNotFoundException(Throwable cause) {
        super(cause);
    }

    public GateIdNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
