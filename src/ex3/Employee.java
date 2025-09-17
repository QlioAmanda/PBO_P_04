package ex3;

public class Employee extends Sortable {
    private String name;
    protected double salary;
    private int hireYear;

    public Employee(String n, double s, int year) {
        this.name = n;
        this.salary = s;
        this.hireYear = year;
    }

    public void print() {
        System.out.println(name + " " + salary + " " + hireYear);
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    public int getHireYear() { return hireYear; }

    @Override
    public int compare(Sortable b) {
        Employee e = (Employee) b;
        return Double.compare(this.salary, e.salary);
    }
}
