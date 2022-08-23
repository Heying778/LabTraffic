package vehicles;

public class Motorcycle extends FamilyVehicle{

    public Motorcycle(String brand, String license) {
        super(brand, license);

    }

    public String makeNoise (){
        return "BP BP!";
    }
    @Override
    public String familyVehicle(){
        return "I am here with my partner.";
    }


}
