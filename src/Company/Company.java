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
            staff.add(new Operator());
        }
        for (int newManager = 1; newManager <= manager; newManager++) {
            staff.add(new Manager());
        }
        for (int newTopManager = 1; newTopManager <= topManager; newTopManager++) {
            staff.add(new TopManager(this));
        }
    }

    public List<Employee> getStaff() {
        return staff;
    }

    public long getIncome() {
        return income;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        staff.sort(new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return o2.getSalary().compareTo(o1.getSalary());
            }
        });

        List<Employee> topSalaryStaff = new ArrayList<Employee>();

        for (int i = 0; i < count; i++) {
            topSalaryStaff.add(staff.get(i));
        }

        return topSalaryStaff;
    }

    public List<Employee> getLowerSalaryStaff(int count) {
        staff.sort(new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });

        List<Employee> lowerSalaryStaff = new ArrayList<Employee>();

        for (int i = 0; i < count; i++) {
            lowerSalaryStaff.add(staff.get(i));
        }

        return lowerSalaryStaff;
    }

}

