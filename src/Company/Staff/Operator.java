package Company.Staff;

public class Operator implements Employee {

    private int salary = 30000;
    private static double IMPROVER = 0.8;
    private static double MIDDLE = 1.0;
    private static double SENIOR = 1.2;

    public Operator() {
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
    }

    public Integer getSalary() {
        return salary;
    }
}
