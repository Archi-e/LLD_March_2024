package projects.parkingLot.repository;

import projects.parkingLot.exceptions.ParkingLotIdNotFoundException;
import projects.parkingLot.exceptions.ParkingSpotIdNotFoundException;
import projects.parkingLot.models.ParkingLot;
import projects.parkingLot.models.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepository {
    private Map<Integer, ParkingSpot> parkingSpotMap;
    //private static int idCounter = 0;
    public ParkingSpotRepository() {
        this.parkingSpotMap = new HashMap<>();
    }

    public ParkingSpot get(int parkingSpotId){
        ParkingSpot parkingSpot = parkingSpotMap.get(parkingSpotId);
        if(parkingSpot == null){
            throw new ParkingSpotIdNotFoundException("There is no Parking Spot with id: "+parkingSpotId);
        }
        return parkingSpot;
    }

    public void put(ParkingSpot parkingSpot){
        //parkingSpot.setId(++idCounter);
        parkingSpotMap.put(parkingSpot.getId(), parkingSpot);
        System.out.println("Parking Spot added successfully!");
    }
}
