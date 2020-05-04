import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin= new DatabaseAdmin("Joshi", "NiNo666", 60000);
    }

    @Test
    public void canGetNiNo(){
        assertEquals("NiNo666", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(60000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetName(){
        assertEquals("Joshi", databaseAdmin.getName());
    }
}
