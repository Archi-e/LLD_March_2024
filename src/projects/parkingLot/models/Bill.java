package projects.parkingLot.models;

import projects.parkingLot.models.enums.BillStatus;
import projects.parkingLot.models.enums.PaymentStatus;

import java.time.LocalDateTime;

public class Bill {
    private LocalDateTime exitTime;
    private Gate exitGate;

    private double amount;
    private Ticket ticket;
    private BillStatus billStatus;

    public Bill(){

    }

    public Bill(LocalDateTime exitTime, Gate exitGate, double amount, Ticket ticket, BillStatus billStatus) {
        this.exitTime = exitTime;
        this.exitGate = exitGate;
        this.amount = amount;
        this.ticket = ticket;
        this.billStatus = billStatus;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
}
