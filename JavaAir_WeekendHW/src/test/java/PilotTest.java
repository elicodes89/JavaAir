import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Abdallah" , "Pilot" , "123B");
    }

    @Test
    public void hasName(){
        assertEquals("Abdallah" , pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("Pilot" , pilot.getRank());
    }

    @Test
    public void hasLicenseNumber(){
        assertEquals("123B" , pilot.getLicenseNumber());
    }

}
