package ex3;

import java.util.Calendar;

public class Manager extends Employee {
    private String secretaryName;

    public Manager(String n, double s, int year, String secretaryName) {
        super(n, s, year);
        this.secretaryName = secretaryName;
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    public void setSecretaryName(String secretaryName) {
        this.secretaryName = secretaryName;
    }

    @Override
    public void raiseSalary(double byPercent) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - getHireYear());
        super.raiseSalary(byPercent + bonus);
    }

    @Override
    public void print() {
        // gunakan print() dari Employee
        super.print();
        // tambahkan info secretary
        System.out.println("Secretary: " + secretaryName);
    }
}
