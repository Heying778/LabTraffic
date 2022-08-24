package vehicles;

import interfacess.IVehicles;

public abstract class OtherVehicle extends Vehicle {
    public String type;

    public OtherVehicle(String brand, String license,String type) {
        super(brand, license);
        this.type = "Other";
    }

    @Override
    public String vehicleHorn(){return "We are here for other business.";};

}
