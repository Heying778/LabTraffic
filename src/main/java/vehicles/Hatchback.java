package vehicles;
public class Hatchback extends FamilyVehicle{

    public Hatchback(String brand, String license,String type) {
        super(brand, license, type);

    }

    public String makeNoise (){
        return "BEP BEP!";
    }
    @Override
    public String familyVehicle(){
        return "I am here with my family.";
    }
}
