package vehicles;

public class Suv extends FamilyVehicle{

    public Suv(String brand, String license,String type) {
        super(brand, license, type);

    }

    public String makeNoise (){
        return "BEEP BEEP!";
    }
    @Override

    public String familyVehicle(){
        return "We are travelling as a bigggg family.";
    }


}
