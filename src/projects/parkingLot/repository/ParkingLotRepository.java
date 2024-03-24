package projects.parkingLot.repository;

import projects.parkingLot.exceptions.ParkingLotIdNotFoundException;
import projects.parkingLot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Integer, ParkingLot> parkingLotMap;
    private static int idCounter = 0;
    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }

    public ParkingLot get(int parkingLotId){
        ParkingLot parkingLot = parkingLotMap.get(parkingLotId);
        if(parkingLot == null){
            throw new ParkingLotIdNotFoundException("There is no Parking Lot with id: "+parkingLotId);
        }
        return parkingLot;
    }

    public void put(ParkingLot parkingLot){
        parkingLot.setId(++idCounter);
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        System.out.println("Parking Lot added successfully!");
    }
}
