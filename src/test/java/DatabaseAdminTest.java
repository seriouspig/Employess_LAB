import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {


    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Obama", "1234QWERTY", 20000);
    }

    @Test
    public void managerHasName() {
        assertEquals("Obama", databaseAdmin.getName());
    }

    @Test
    public void managerCanSetName() {
        databaseAdmin.setName("Trump");
        assertEquals("Trump", databaseAdmin.getName());
    }

    @Test
    public void managerHasNIN() {
        assertEquals("1234QWERTY", databaseAdmin.getNInumber());
    }

    @Test
    public void managerCanSetNIN() {
        databaseAdmin.setNInumber("123456qaz");
        assertEquals("123456qaz", databaseAdmin.getNInumber());
    }

    @Test
    public void managerHasSalary() {
        assertEquals(20000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void managerCanSetSalary() {
        databaseAdmin.setSalary(15000);
        assertEquals(15000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void databaseAdminCanGetRaise() {
        databaseAdmin.raiseSalary(2000);
        assertEquals(22000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void databaseAdminGetBonus() {
        assertEquals(200,databaseAdmin.payBonus(), 0.01);
    }
}


