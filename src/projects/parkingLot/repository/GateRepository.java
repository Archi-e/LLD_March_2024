package projects.parkingLot.repository;

import projects.parkingLot.exceptions.GateIdNotFoundException;
import projects.parkingLot.models.Gate;


import java.util.HashMap;
import java.util.Map;

public class GateRepository {

    private Map<Integer, Gate> gateMap;
    //private static int idCounter = 0;
    public GateRepository() {
        this.gateMap = new HashMap<>();
    }

    public Gate get(int gateId){
        Gate gate = gateMap.get(gateId);
        if(gate == null){
            throw new GateIdNotFoundException("There is no gate with id: "+gateId);
        }
        return gate;
    }

    public void put(Gate gate){
        //gate.setId(++idCounter);
        gateMap.put(gate.getId(), gate);
        System.out.println("Gate added successfully!");
    }
}
