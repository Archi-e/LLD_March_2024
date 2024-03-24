package projects.parkingLot.models;

import java.time.LocalDateTime;

public class Ticket extends BaseModel{

    private int ticketNumber;
    private LocalDateTime entryTime;
    private Gate entryGate;
    private Vehicle vehicle;

    private ParkingSpot parkingSpot;

    public Ticket(){

    }

    public Ticket(int ticketNumber, LocalDateTime entryTime, Gate entryGate, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.ticketNumber = ticketNumber;
        this.entryTime = entryTime;
        this.entryGate = entryGate;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
