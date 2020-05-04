import Management.Manager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager manager;

    @Before
    public void before(){
        manager= new Manager("Bossman", "NiNo90210", 80000,"Development");
    }

    @Test
    public void canGetRaise(){
        manager.raiseSalary(300);
        assertEquals(80300, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(800, manager.payBonus(), 0.01);
    }
}
