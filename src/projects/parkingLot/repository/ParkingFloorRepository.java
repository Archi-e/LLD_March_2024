package projects.parkingLot.repository;

import projects.parkingLot.exceptions.ParkingFloorIdNotFoundException;
import projects.parkingLot.models.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {
    private Map<Integer, ParkingFloor> parkingFloorMap;
    //private static int idCounter = 0;
    public ParkingFloorRepository() {
        this.parkingFloorMap = new HashMap<>();
    }

    public ParkingFloor get(int parkingFloorId){
        ParkingFloor parkingFloor = parkingFloorMap.get(parkingFloorId);
        if(parkingFloor == null){
            throw new ParkingFloorIdNotFoundException("There is no Parking Floor with id: "+parkingFloorId);
        }
        return parkingFloor;
    }

    public void put(ParkingFloor parkingFloor){
        //parkingFloor.setId(++idCounter);
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        System.out.println("Parking Floor added successfully!");
    }
}
