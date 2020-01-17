package Company.Staff;
import Company.Company;


public class Manager implements Employee {

    private int salary = 40000;
    private int salesAmount;
    private static double INTERN = 0.9;
    private static double REGULAR = 1.1;
    private static final double PERCENT_OF_SALE = 0.05;

    public Manager(){
        double grade = Math.random();
        double productPrice = 100000 + (int)(Math.random() * 100000);        // Генерируем сумму продаж
        salesAmount = (int) (productPrice * PERCENT_OF_SALE);
        if (grade < 0.3){
            salary = (int) (salary * INTERN);
        }
        if (grade > 0.3){
            salary = (int) (salary * REGULAR);
        }

    }

    public Integer getSalary() {
        return salary + (int) salesAmount;
    }
}


