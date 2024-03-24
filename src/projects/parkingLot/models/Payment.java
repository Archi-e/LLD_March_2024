package projects.parkingLot.models;

import projects.parkingLot.models.enums.PaymentMode;
import projects.parkingLot.models.enums.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseModel{
    private double amount;
    private PaymentStatus paymentStatus;

    private String transactionRef;
    private PaymentMode paymentMode;
    private LocalDateTime paymentTime;
    private Bill bill;

    public Payment(){

    }

    public Payment(double amount, PaymentStatus paymentStatus, String transactionRef, PaymentMode paymentMode, LocalDateTime paymentTime, Bill bill) {
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.transactionRef = transactionRef;
        this.paymentMode = paymentMode;
        this.paymentTime = paymentTime;
        this.bill = bill;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTransactionRef() {
        return transactionRef;
    }

    public void setTransactionRef(String transactionRef) {
        this.transactionRef = transactionRef;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
