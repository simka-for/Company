import Company.*;



public class Main {
    public static void main(String[] args) {

        Company intel = new Company(120000000);

        intel.hireAll(180, 80, 10);

        intel.getLowerSalaryStaff(15);
        intel.getTopSalaryStaff(30);

        System.out.println("\nПроизошло сокращение сотрудников!\n");
        for (int i = 0; i <= 135; i++) {
            intel.fireEmployees(i);
        }

        intel.getLowerSalaryStaff(15);
        intel.getTopSalaryStaff(30);

    }
}
