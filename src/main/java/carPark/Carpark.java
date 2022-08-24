package carPark;
import floor.Floor;
import vehicles.FamilyVehicle;
import vehicles.Vehicle;
public class Carpark {
    private Floor countVehicle;
    private Vehicle type;

    public Carpark(Floor countVehicle,Vehicle type){
        this.countVehicle = countVehicle;
        this.type = type;
    }

    public Floor getCountVehicle() {
        return countVehicle;
    }

    public void setCountVehicle(Floor countVehicle) {
        this.countVehicle = countVehicle;
    }

    public Vehicle getType() {
        return type;
    }

    public void setType(Vehicle type) {
        this.type = type;
    }

    public void addVehicle2Carpark(Vehicle vehicle,Floor floor){
        floor.addVehicle(vehicle);
    }

    public String guideVehicle2Floor() {
        for (int type = 0; type <100;type ++) {
            if (type == 0) {
                return "Please go to the parking area for Other Vehicles.";
            } else if (type == 1) {
                return "Please go to the parking area for Family Vehicles.";
            } else {
                return "Please wait for further guidance.";
            }

        }
        return null;
    }
}
