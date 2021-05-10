import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Clinton", "999666999AA", 30000);
    }

    @Test
    public void developerHasName() {
        assertEquals("Clinton", developer.getName());
    }

    @Test
    public void developerCanSetName() {
        developer.setName("Bush");
        assertEquals("Bush", developer.getName());
    }

    @Test
    public void developerHasNIN() {
        assertEquals("999666999AA", developer.getNInumber());
    }

    @Test
    public void developerCanSetNIN() {
        developer.setNInumber("999666999BB");
        assertEquals("999666999BB", developer.getNInumber());
    }

    @Test
    public void developerHasSalary() {
        assertEquals(30000, developer.getSalary(), 0.01);
    }

    @Test
    public void developerCanSetSalary() {
        developer.setSalary(35000);
        assertEquals(35000, developer.getSalary(), 0.01);
    }

    @Test
    public void developerCanGetRaise() {
        developer.raiseSalary(3000);
        assertEquals(33000, developer.getSalary(), 0.01);
    }

    @Test
    public void developerGetBonus() {
        assertEquals(300,developer.payBonus(), 0.01);
    }
}