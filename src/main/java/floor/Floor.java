package floor;

import vehicles.FamilyVehicle;
import vehicles.OtherVehicle;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Floor {

    private int floor;
    private ArrayList<Vehicle> vehicles;


    public Floor(int floor) {
        this.floor = floor;
        this.vehicles = new ArrayList<>();
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public int countVehicles() {
        return this.vehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }



}
