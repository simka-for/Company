package Company;

import Company.Staff.Employee;
import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void hairEmployees(Employee employee){              // Найм сотрудника
        employees.add(employee);
    }

    public void fireEmployees(Employee employee){              // Увольнение сотрудника
        employees.remove(employee);
    }

    public ArrayList<Employee> getEmployees(){                 // Вызов списка сотрудников
        return employees;
    }


}
