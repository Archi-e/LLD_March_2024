package projects.parkingLot;

import projects.parkingLot.controller.InitController;
import projects.parkingLot.repository.GateRepository;
import projects.parkingLot.repository.ParkingFloorRepository;
import projects.parkingLot.repository.ParkingLotRepository;
import projects.parkingLot.repository.ParkingSpotRepository;
import projects.parkingLot.service.InitialisationService;

public class ParkingLotMain {
    public static void main(String[] args) {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        GateRepository gateRepository = new GateRepository();

        InitialisationService initialisationService = new InitialisationService(parkingLotRepository,
                parkingFloorRepository,
                parkingSpotRepository,
                gateRepository);

        InitController initController = new InitController(initialisationService);

        initController.init();
        System.out.println("END");
    }
}
