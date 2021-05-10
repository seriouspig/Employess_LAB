package staff;

public abstract class Employee {

    private String name;
    private String NInumber;
    private double salary;

    public Employee(String name, String NInumber, double salary) {
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 1) {
            return;
        }
        this.name = name;
    }

    public String getNInumber() {
        return NInumber;
    }

    public void setNInumber(String NInumber) {
        this.NInumber = NInumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double salaryRaise) {
        if (salaryRaise < 0) {
            return;
        }
        this.salary += salaryRaise;
    }

    public double payBonus() {
        return salary * 0.01;
    }
}
