import Company.*;
import Company.Staff.Employee;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company intel = new Company(120000000);
        List<Employee> staffIntel = intel.getStaff();

        intel.hireAll(180,80,10);

        int countTopSalary = 15;
        List<Employee> topSalaryStaff = intel.getTopSalaryStaff(countTopSalary);

        System.out.println("СПИСОК САМЫХ ВЫСОКИХ ЗАРПЛАТ:");
        for (int i = 0; i < countTopSalary; i++) {
            System.out.println((i + 1) + ". " + topSalaryStaff.get(i).getSalary() + " руб.");
        }

        int countLowerSalary = 30;
        List<Employee> lowerSalaryStaff = intel.getLowerSalaryStaff(countLowerSalary);

        System.out.println("СПИСОК САМЫХ НИЗКИХ ЗАРПЛАТ:");
        for (int i = 0; i < countLowerSalary; i++) {
            System.out.println((i + 1) + ". " + lowerSalaryStaff.get(i).getSalary() + " руб.");
        }

        for (int i = 0; i <= 135; i++){
            intel.fireEmployees(i);
        }

        System.out.println("ПРОИЗОШЛО СОКРАЩЕНИЕ, БЫЛО УВОЛЕНО 50% СОТРУДНИКОВ");

        System.out.println("СПИСОК САМЫХ ВЫСОКИХ ЗАРПЛАТ:");
        for (int i = 0; i < countTopSalary; i++) {
            System.out.println((i + 1) + ". " + topSalaryStaff.get(i).getSalary() + " руб.");
        }

        System.out.println("СПИСОК САМЫХ НИЗКИХ ЗАРПЛАТ:");
        for (int i = 0; i < countLowerSalary; i++) {
            System.out.println((i + 1) + ". " + lowerSalaryStaff.get(i).getSalary() + " руб.");
        }

    }
}
