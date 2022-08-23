package vehicles;

import interfacess.IVehicles;

public abstract class OtherVehicle implements IVehicles {
    private String brand;

    private String license;

    public OtherVehicle(String brand, String license) {

        this.brand = brand;
        this.license = license;
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
