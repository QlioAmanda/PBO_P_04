package ex3;

public class ManagerTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Kenzo ", 2000000, 1999);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1991, "Anna");
        staff[2] = new Employee("Isabel Vidal", 3000000, 1993);

        for (Employee e : staff) e.raiseSalary(5);
        for (Employee e : staff) e.print();

        System.out.println("--- Sorting ---");
        Sortable.shell_sort(staff);
        for (Employee e : staff) e.print();
    }
}
