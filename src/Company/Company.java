package Company;

import Company.Staff.Employee;
import Company.Staff.Manager;
import Company.Staff.Operator;
import Company.Staff.TopManager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {

    long income;

    private ArrayList<Employee> staff = new ArrayList<>();

    public Company(long income) {
        this.income = income;
    }

    public ArrayList<Employee> getStaff() {
        return staff;
    }

    public void hireEmployees(Employee employee) {              // Найм сотрудника
        staff.add(employee);
    }

    public void fireEmployees(int indexEmployee) {             // Увольнение сотрудника
        if (indexEmployee < staff.size()) {
            staff.remove(indexEmployee);
        } else {
            staff.remove(0);
        }
    }

    public void hireAll(int operator, int manager, int topManager) {               // Найм списка сотрудников
        for (int newOperator = 1; newOperator <= operator; newOperator++) {
            staff.add(new Operator(this));
        }
        for (int newManager = 1; newManager <= manager; newManager++) {
            staff.add(new Manager(this));
        }
        for (int newTopManager = 1; newTopManager <= topManager; newTopManager++) {
            staff.add(new TopManager(this));
        }
    }


    public long getIncome() {
        return income;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        staff.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getSalary().compareTo(o1.getSalary());
            }
        });

        List<Employee> topSalaryStaff = new ArrayList<Employee>();


        if (count < staff.size()) {
            for (int i = 0; i < count; i++) {
                topSalaryStaff.add(staff.get(i));
            }
        }
        if (count <= topSalaryStaff.size()) {

            System.out.println(("СПИСОК САМЫХ ВЫСОКИХ ЗАРПЛАТ:"));
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + topSalaryStaff.get(i).getSalary() + " руб.");
            }
        }else{
            System.out.println("Превышено количество сотрудников!");
        }

        return topSalaryStaff;
    }

    public List<Employee> getLowerSalaryStaff(int count) {
        staff.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });

        List<Employee> lowerSalaryStaff = new ArrayList<Employee>();

        if (count < staff.size()) {
            for (int i = 0; i < count; i++) {
                lowerSalaryStaff.add(staff.get(i));
            }
        }
        if( count <= lowerSalaryStaff.size()) {
            System.out.println(("СПИСОК САМЫХ НИЗКИХ ЗАРПЛАТ:"));
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + lowerSalaryStaff.get(i).getSalary() + " руб.");
            }
        }else{
            System.out.println("Превышено количество сотрудников!");
        }
        return lowerSalaryStaff;
    }
}

