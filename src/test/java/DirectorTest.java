import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director= new Director("ELON MUSKY", "NiNo420", 3000000, "Executive", 5000000);
    }

    @Test
    public void canGetBudget(){
        assertEquals(5000000, director.getBudget(), 0.01);
    }

    @Test
    public void canPayDirectorBonus(){
        assertEquals(60000, director.payBonus(), 0.01);
    }
}
