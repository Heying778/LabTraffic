package vehicles;

import interfacess.IVehicles;

public abstract class FamilyVehicle extends Vehicle {

    private int type;
    public FamilyVehicle(String brand, String license,int type) {
        super(brand, license);
        this.type = 0;
    }
    public String getType() {
        if (this.type == 0) {
            return "this is a Family Vehicle.";
        }
        return null;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String makeNoise(){
        return "We travel as a family.";
    }

}
