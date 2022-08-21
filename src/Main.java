import java.util.Arrays;

public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee(" Fam 1 ", "Name1", "SName1", 1, 134567f);
        employees[1] = new Employee("Fam 2", "Name2", "SName2", 1, 148000f);
        employees[2] = new Employee("Fam 3", "Name3", "SName3", 2, 190800f);
        employees[3] = new Employee("Fam 4", "Name4", "SName4", 2, 203000f);
        employees[4] = new Employee("Fam 5", "Name5", "SName5", 3, 115700f);
        employees[5] = new Employee("Fam 6", "Name6", "SName6", 3, 125000f);
        employees[6] = new Employee("Fam 7", "Name7", "SName7", 4, 256000f);
        employees[7] = new Employee("Fam 8", "Name8", "SName8", 5, 178000f);
        employees[9] = new Employee("Fam 10", "Name10", "SName10", 5, 96800f);

        printAllEmployee();
        System.out.println("sum salary of an employee:" + getAndCalculateSalarySum() + "rub.");
        System.out.println(getEmployeeMinSalary());
        System.out.println(getEmployeeMaxSalary());
        System.out.println("avg salary of an employee:" + getAndCalculateAverageSalary() + "rub.");
        printFamNameSNameAllEmployee();
    }

    public static void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static float getAndCalculateSalarySum() {
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeMinSalary() {
        float minSalary = -1;
        Employee minSalaryEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees != null) {
                minSalary = employees[i].getSalary();
                index = i;
                break;
            }
        }
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    minSalaryEmpl = employees[i];


                }
            }
        }
        return minSalaryEmpl;
    }

    public static Employee getEmployeeMaxSalary() {
        float maxSalary = -1;
        Employee maxSalaryEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees != null) {
                maxSalary = employees[i].getSalary();
                index = i;
                break;
            }
        }
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmpl = employees[i];


                }
            }
        }
        return maxSalaryEmpl;
    }

    public static float getAndCalculateAverageSalary() {
        float sumSalaryAllEmpl = getAndCalculateSalarySum();
        if (employees.length != 0) {
            return sumSalaryAllEmpl / employees.length;
        } else {
            return 0;
        }
    }

    public static void printFamNameSNameAllEmployee() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFam() + "." + employee.getName() + "." + employee.getSName());
            }
        }
    }

}



