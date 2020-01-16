package Company.Staff;

public class Operator implements Employee {

    private double salary;

    public Operator(){
        salary = 25000.00;
    }
    public double getMontSalary(){
        return salary;
    }
}
