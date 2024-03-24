package projects.parkingLot.service;

import projects.parkingLot.models.Gate;
import projects.parkingLot.models.ParkingFloor;
import projects.parkingLot.models.ParkingLot;
import projects.parkingLot.models.ParkingSpot;
import projects.parkingLot.models.enums.*;
import projects.parkingLot.repository.GateRepository;
import projects.parkingLot.repository.ParkingFloorRepository;
import projects.parkingLot.repository.ParkingLotRepository;
import projects.parkingLot.repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitialisationService {
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private GateRepository gateRepository;

    public InitialisationService(ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository, ParkingSpotRepository parkingSpotRepository, GateRepository gateRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.gateRepository = gateRepository;
    }

    public ParkingLot init(){
        System.out.println("**** Initialising Parking Lot ****");
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Park-In");
        parkingLot.setAddress("Somewhere on Mars, lol");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setCapacity(100);
        parkingLot.setVehicleSupported(List.of(VehicleType.FOUR_WHEELER, VehicleType.TWO_WHEELER, VehicleType.EV));

        List<ParkingFloor> floors = new ArrayList<>();
        for(int i=1; i<=10; i++){
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setId(i);
            parkingFloor.setFloorNumber(i);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.AVAILABLE);

            List<ParkingSpot> spots = new ArrayList<>();
            for(int j=1; j<=10; j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setId(i);
                parkingSpot.setSpotNumber((10*i) + 1);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
                spots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }

            Gate entrygate = new Gate();
            entrygate.setId((100*i) + 1);
            entrygate.setGateNumber((1000*i) + 1);
            entrygate.setGateStatus(GateStatus.OPEN);
            entrygate.setOperator("Operator"+i);
            entrygate.setGateType(GateType.ENTRY_GATE);
            gateRepository.put(entrygate);

            Gate exitgate = new Gate();
            exitgate.setId((100*i) + 2);
            exitgate.setGateNumber((1000*i) + 2);
            exitgate.setGateStatus(GateStatus.OPEN);
            exitgate.setOperator("Operator"+i);
            exitgate.setGateType(GateType.EXIT_GATE);
            gateRepository.put(exitgate);



            floors.add(parkingFloor);
            parkingFloorRepository.put(parkingFloor);
        }
        parkingLot.setParkingFloorList(floors);
        parkingLotRepository.put(parkingLot);
        return parkingLotRepository.get(1);
    }
}
