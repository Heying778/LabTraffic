package vehicles;

public class Truck extends OtherVehicle{

    public Truck(String brand, String license) {
        super(brand, license);

    }

    public String makeNoise (){
        return "BEEEEP BEEEEP!";
    }
    @Override
    public String otherVehicle(){
        return "We are here to load cargos.";
    }


}
