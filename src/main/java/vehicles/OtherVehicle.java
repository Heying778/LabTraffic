package vehicles;

import interfacess.IVehicles;

public abstract class OtherVehicle implements IVehicles {
    private String brand;
    private String type;

    private String license;

    public OtherVehicle(String brand, String license, String type) {

        this.brand = brand;
        this.license = license;
        this.type = type;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicence() {
        return this.license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public abstract String makeNoise();
    public abstract String otherVehicle();

}
