package projects.parkingLot.exceptions;

public class ParkingLotIdNotFoundException extends RuntimeException{
    public ParkingLotIdNotFoundException() {
    }

    public ParkingLotIdNotFoundException(String message) {
        super(message);
    }

    public ParkingLotIdNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingLotIdNotFoundException(Throwable cause) {
        super(cause);
    }

    public ParkingLotIdNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
