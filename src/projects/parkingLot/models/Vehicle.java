package projects.parkingLot.models;

import projects.parkingLot.models.enums.VehicleType;

public class Vehicle extends BaseModel{

    private String Vehicle_Number;
    private VehicleType vehicleType;
    private String color;

    public Vehicle(){

    }
    public Vehicle(String vehicle_Number, VehicleType vehicleType, String color) {
        Vehicle_Number = vehicle_Number;
        this.vehicleType = vehicleType;
        this.color = color;
    }

    public String getVehicle_Number() {
        return Vehicle_Number;
    }

    public void setVehicle_Number(String vehicle_Number) {
        Vehicle_Number = vehicle_Number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
