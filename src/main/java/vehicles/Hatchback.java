package vehicles;
public class Hatchback extends FamilyVehicle{

    public Hatchback(String brand, String license,String type) {
        super(brand, license, type);

    }

    @Override
    public String  vehicleHorn(){
        return "BEP BEP!";
    }
}
