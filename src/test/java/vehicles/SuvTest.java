package vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuvTest {

    private Suv suv;
    @BeforeEach
    public void setUp(){
        suv = new Suv("Dodge","234","FamilyVehicle");
    }

    @Test
    public void canVehicleHorn(){
        String expected = "BEEP BEEP!";
        String actual = suv.vehicleHorn();
        assertEquals(expected,actual);
    }
    @Test
    public void canMakeNoise(){
        String expected = "We are travelling as a bigggg family.";
        String actual = suv.makeNoise();
        assertEquals(expected,actual);
    }
}
