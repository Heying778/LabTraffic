package vehicles;

public class Motorcycle extends FamilyVehicle{

    public Motorcycle(String brand, String license,String type) {
        super(brand, license, type);

    }
    @Override
    public String vehicleHorn(){
        return "BP BP!";
    }
    public String makeNoise (){
        return "I am here with my partner.";
    }


}
