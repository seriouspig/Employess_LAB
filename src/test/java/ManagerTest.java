import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Obama", "1234QWERTY", 20000, "CodeClan HR");
    }

    @Test
    public void managerHasName() {
        assertEquals("Obama", manager.getName());
    }

    @Test
    public void managerCanSetName() {
        manager.setName("Trump");
        assertEquals("Trump", manager.getName());
    }

    @Test
    public void managerHasNIN() {
        assertEquals("1234QWERTY", manager.getNInumber());
    }

    @Test
    public void managerCanSetNIN() {
        manager.setNInumber("123456qaz");
        assertEquals("123456qaz", manager.getNInumber());
    }

    @Test
    public void managerHasSalary() {
        assertEquals(20000, manager.getSalary(), 0.01);
    }

    @Test
    public void managerCanSetSalary() {
        manager.setSalary(15000);
        assertEquals(15000, manager.getSalary(), 0.01);
    }

    @Test
    public void managerHasDeptStore() {
        assertEquals("CodeClan HR", manager.getDeptName());
    }

    @Test
    public void managerCanSetDeptStore() {
        manager.setDeptName("HappyProvider");
        assertEquals("HappyProvider", manager.getDeptName());
    }

    @Test
    public void managerCanGetRaise() {
        manager.raiseSalary(2000);
        assertEquals(22000, manager.getSalary(), 0.01);
    }

    @Test
    public void managerGetBonus() {
        assertEquals(200,manager.payBonus(), 0.01);
    }
}