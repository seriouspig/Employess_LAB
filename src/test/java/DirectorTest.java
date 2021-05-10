import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Washington", "007ABC", 200000, "CodeClan",1000000);
    }

    @Test
    public void directorHasName() {
        assertEquals("Washington", director.getName());
    }

    @Test
    public void directorCanSetName() {
        director.setName("Trump");
        assertEquals("Trump", director.getName());
    }

    @Test
    public void directorHasNIN() {
        assertEquals("007ABC", director.getNInumber());
    }

    @Test
    public void directorCanSetNIN() {
        director.setNInumber("123456qaz");
        assertEquals("123456qaz", director.getNInumber());
    }

    @Test
    public void directorHasSalary() {
        assertEquals(200000, director.getSalary(), 0.01);
    }

    @Test
    public void directorCanSetSalary() {
        director.setSalary(15000);
        assertEquals(15000, director.getSalary(), 0.01);
    }

    @Test
    public void directorHasDeptStore() {
        assertEquals("CodeClan", director.getDeptName());
    }

    @Test
    public void directorCanSetDeptStore() {
        director.setDeptName("HappyProvider");
        assertEquals("HappyProvider", director.getDeptName());
    }

    @Test
    public void directorCanGetRaise() {
        director.raiseSalary(20000);
        assertEquals(220000, director.getSalary(), 0.01);
    }

    @Test
    public void directorGetBonus() {
        assertEquals(4000,director.payBonus(), 0.01);
    }

    @Test
    public void directorHasBudget() {
        assertEquals(1000000, director.getBudget(), 0.01);
    }

    @Test
    public void directorCanSetBudget() {
        director.setBudget(1500000);
        assertEquals(1500000, director.getBudget(), 0.01);
    }

    @Test
    public void directorCantGetNegativeRaise() {
        director.raiseSalary(-20000);
        assertEquals(200000, director.getSalary(), 0.01);
    }

    @Test
    public void directorCantSetNullName() {
        director.setName("");
        assertEquals("Washington", director.getName());
    }

}
