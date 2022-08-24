package vehicles;

public class Truck extends OtherVehicle{

    public Truck(String brand, String license,String type) {
        super(brand, license, type);

    }
    @Override
    public String  vehicleHorn(){
        return "BEEEEP BEEEEP!";
    }
    public String makeNoise(){
        return "We are here to load cargos.";
    }


}
