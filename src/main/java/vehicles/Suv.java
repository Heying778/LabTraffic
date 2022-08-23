package vehicles;

public class Suv extends FamilyVehicle{

    public Suv(String brand, String license) {
        super(brand, license);

    }

    public String makeNoise (){
        return "BEEP BEEP!";
    }
    @Override
    public String familyVehicle(){
        return "We are travelling as a bigggg family.";
    }


}
