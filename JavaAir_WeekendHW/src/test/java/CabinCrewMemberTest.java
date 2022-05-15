import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Rocco" , "Flight Attendant");
    }

    @Test
    public void hasName(){
        assertEquals("Rocco" , cabinCrewMember.getName());
    }

    @Test
    public void hasARank(){
        assertEquals("Flight Attendant" , cabinCrewMember.getRank());
    }

}