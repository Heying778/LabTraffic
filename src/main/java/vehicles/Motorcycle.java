package vehicles;

public class Motorcycle extends FamilyVehicle{

    public Motorcycle(String brand, String license,String type) {
        super(brand, license, type);

    }

    public String makeNoise (){
        return "BP BP!";
    }
    @Override
    public String familyVehicle(){
        return "I am here with my partner.";
    }


}
