package Company.Staff;

public interface Employee {

    double getMontSalary();
    default void calculateSalary(double companyIncome) {
    }
}
