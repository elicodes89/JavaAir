import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Papi" , 1);
    }

    @Test
    public void hasName(){
        assertEquals("Papi" , passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(1 , passenger.getBags());
    }
}
