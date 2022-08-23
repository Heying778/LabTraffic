package vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TruckTest {
    private Truck truck;
    @BeforeEach
    public void setUp(){
        truck = new Truck("Ford","123","OtherVehicle");
    }

    @Test
    public void canMakeNoise(){
        String expected = "BEEEEP BEEEEP!";
        String actual = truck.makeNoise();
        assertEquals(expected,actual);
    }
    @Test
    public void canFamilyVehicle(){
        String expected =  "We are here to load cargos.";
        String actual = truck.otherVehicle();
        assertEquals(expected,actual);
    }
}
