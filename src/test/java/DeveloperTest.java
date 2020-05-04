import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer= new Developer("Yoshi", "NiNo345", 50000);
    }

    @Test
    public void canGetNiNo(){
        assertEquals("NiNo345", developer.getNationalInsuranceNumber());

    }

    @Test
    public void canGetSalary(){
        assertEquals(50000, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetName(){
        assertEquals("Yoshi", developer.getName());
    }

    @Test
    public void canChangeName(){
        developer.setName(null);
        assertEquals("Yoshi", developer.getName());
    }

}
