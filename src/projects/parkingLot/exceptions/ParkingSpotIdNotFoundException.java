package projects.parkingLot.exceptions;

public class ParkingSpotIdNotFoundException extends RuntimeException{
    public ParkingSpotIdNotFoundException() {
    }

    public ParkingSpotIdNotFoundException(String message) {
        super(message);
    }

    public ParkingSpotIdNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingSpotIdNotFoundException(Throwable cause) {
        super(cause);
    }

    public ParkingSpotIdNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
