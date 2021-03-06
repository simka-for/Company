package Company.Staff;
import Company.Company;

public class TopManager implements Employee {

    Company company;
    private int salary = 150000;
    long incomeBonus = 10000000;
    private static double INTERN = 0.7;
    private static double REGULAR = 1.3;

    public TopManager(Company company){
        double grade = Math.random();
        if (company.getIncome() >= incomeBonus){
            salary = (int) (salary * 2.5);
        }
        if (grade > 0.3 ){
            salary = (int) (salary * INTERN);
        }else{
            salary = (int) (salary * REGULAR);
        }
        this.company = company;
    }

    @Override
    public Integer getSalary() {
        return salary;
    }



}
