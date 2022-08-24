package vehicles;

import interfacess.IVehicles;

public abstract class OtherVehicle extends Vehicle {
    public int type;

    public OtherVehicle(String brand, String license,int type) {
        super(brand, license);
        this.type = 1;
    }
    public String getType() {
        if (this.type == 1) {
            return "this is an Other Vehicle.";
        }
        return null;
    }

    @Override
    public String vehicleHorn(){return "We are here for other business.";};

}
