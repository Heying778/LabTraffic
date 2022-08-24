package floor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vehicles.Hatchback;
import vehicles.Vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FloorTest {
    private Floor floor;

    @BeforeEach
    public void setup(){
        floor = new Floor(1);
    }
    @Test
    public void cancountVehicles(){
        int expected = 0;
        int actual = floor.countVehicles();
        assertEquals(expected, actual);
    }

    public void canAddVehicle(){
        Vehicle vehicle = new Hatchback("MG","999","1");
        floor.addVehicle(vehicle);
        int expected = 1;
        int actual = floor.addVehicle();
        assertEquals(expected, actual);
    }

}
