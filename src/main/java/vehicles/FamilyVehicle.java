package vehicles;

import interfacess.IVehicles;

public abstract class FamilyVehicle extends Vehicle {

    private String type;
    public FamilyVehicle(String brand, String license,String type) {
        super(brand, license);
        this.type = "Family";
    }
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String makeNoise(){
        return "We travel as a family.";
    }

}
