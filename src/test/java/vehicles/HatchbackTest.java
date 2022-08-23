package vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HatchbackTest {
    private Hatchback hatchback;
    @BeforeEach
    public void setUp(){
        hatchback = new Hatchback("Ford","123","FamilyVehicle");
    }

    @Test
    public void canMakeNoise(){
        String expected = "BEP BEP!";
        String actual = hatchback.makeNoise();
        assertEquals(expected,actual);
    }
    @Test
    public void canFamilyVehicle(){
        String expected = "I am here with my family.";
        String actual = hatchback.familyVehicle();
        assertEquals(expected,actual);
    }

}
