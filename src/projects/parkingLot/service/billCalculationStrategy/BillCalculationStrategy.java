package projects.parkingLot.service.billCalculationStrategy;

import projects.parkingLot.models.Bill;
import projects.parkingLot.models.Ticket;

public interface BillCalculationStrategy {
    public Bill getBill(Ticket ticket);
}
