package Company.Staff;

import Company.Company;

public class Operator implements Employee {

    Company company;
    private int salary = 30000;
    private static double IMPROVER = 0.8;
    private static double MIDDLE = 1.0;
    private static double SENIOR = 1.2;

    public Operator(Company company) {
        double grade = Math.random();
        if (grade < 0.15) {
            salary = (int) (salary * IMPROVER);
        }
        if (grade > 0.15 && grade < 0.9) {
            salary = (int) (salary * MIDDLE);
        }
        if (grade > 0.9) {
            salary = (int) (salary * SENIOR);
        }
        this.company = company;
    }

    @Override
    public Integer getSalary() {
        return salary;
    }
}
