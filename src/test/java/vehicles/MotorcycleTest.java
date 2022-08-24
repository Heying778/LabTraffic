package vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorcycleTest {
    private Motorcycle motorcycle;
    @BeforeEach
    public void setUp(){
        motorcycle = new Motorcycle("BMW","345","FamilyVehicle");
    }

    @Test
    public void canVehicleHorn(){
        String expected = "BP BP!";
        String actual = motorcycle.vehicleHorn();
        assertEquals(expected,actual);
    }
    @Test
    public void canMakeNoise(){
        String expected = "I am here with my partner.";
        String actual = motorcycle.makeNoise();
        assertEquals(expected,actual);
    }
}
