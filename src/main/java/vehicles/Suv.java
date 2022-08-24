package vehicles;

public class Suv extends FamilyVehicle{

    public Suv(String brand, String license,String type) {
        super(brand, license, type);

    }
    @Override
    public String vehicleHorn(){
        return "BEEP BEEP!";
    }


}
