package projects.parkingLot.models;

import projects.parkingLot.models.enums.ParkingLotStatus;
import projects.parkingLot.models.enums.VehicleType;
import projects.parkingLot.service.billCalculationStrategy.BillCalculationStrategy;
import projects.parkingLot.service.spotAllocationStrategy.SpotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String name;
    private String address;
    private ParkingLotStatus parkingLotStatus;
    private List<ParkingFloor> parkingFloorList;
    private List<VehicleType> vehicleSupported;
    private int capacity;
    private SpotAllocationStrategy spotAllocationStrategy;
    private BillCalculationStrategy billCalculationStrategy;

    public ParkingLot(){

    }

    public ParkingLot(String name, String address, ParkingLotStatus parkingLotStatus, List<ParkingFloor> parkingFloorList, List<VehicleType> vehicleSupported, int capacity, SpotAllocationStrategy spotAllocationStrategy, BillCalculationStrategy billCalculationStrategy) {
        this.name = name;
        this.address = address;
        this.parkingLotStatus = parkingLotStatus;
        this.parkingFloorList = parkingFloorList;
        this.vehicleSupported = vehicleSupported;
        this.capacity = capacity;
        this.spotAllocationStrategy = spotAllocationStrategy;
        this.billCalculationStrategy = billCalculationStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<ParkingFloor> getParkingFloorList() {
        return parkingFloorList;
    }

    public void setParkingFloorList(List<ParkingFloor> parkingFloorList) {
        this.parkingFloorList = parkingFloorList;
    }

    public List<VehicleType> getVehicleSupported() {
        return vehicleSupported;
    }

    public void setVehicleSupported(List<VehicleType> vehicleSupported) {
        this.vehicleSupported = vehicleSupported;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public SpotAllocationStrategy getSpotAllocationStrategy() {
        return spotAllocationStrategy;
    }

    public void setSpotAllocationStrategy(SpotAllocationStrategy spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    public BillCalculationStrategy getBillCalculationStrategy() {
        return billCalculationStrategy;
    }

    public void setBillCalculationStrategy(BillCalculationStrategy billCalculationStrategy) {
        this.billCalculationStrategy = billCalculationStrategy;
    }
}
