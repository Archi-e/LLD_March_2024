package projects.parkingLot.exceptions;

public class ParkingFloorIdNotFoundException extends RuntimeException{
    public ParkingFloorIdNotFoundException() {
    }

    public ParkingFloorIdNotFoundException(String message) {
        super(message);
    }

    public ParkingFloorIdNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingFloorIdNotFoundException(Throwable cause) {
        super(cause);
    }

    public ParkingFloorIdNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
