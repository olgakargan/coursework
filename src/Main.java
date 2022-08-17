import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];


        employees[0] = new Employee(" Fam 1 ", "Name1", "SName1", 1, 134567f);
        employees[1] = new Employee("Fam 2", "Name2", "SName2", 1, 148000f);
        employees[2] = new Employee("Fam 3", "Name3", "SName3", 1, 190800f);
        employees[3] = new Employee("Fam 4", "Name4", "SName4", 2, 203000f);
        employees[4] = new Employee("Fam 5", "Name5", "SName5", 2, 115700f);
        employees[5] = new Employee("Fam 6", "Name6", "SName6", 2, 125000f);
        employees[6] = new Employee("Fam 7", "Name7", "SName7", 3, 256000f);
        employees[7] = new Employee("Fam 8", "Name8", "SName8", 3, 178000f);
        employees[8] = new Employee("Fam 9", "Name9", "SName9", 3, 246000f);
        employees[9] = new Employee("Fam 10", "Name10", "SName10", 3, 96800f);

        for (Employee e : employees) {
            System.out.println(e);
        }

        int i1 = 0;
        int i2 = 1;
        for(int a = 1; a < employees.length; a++) {
            if (employees[i1].getSalary() > employees[i2].getSalary()) {
                i2++;
            } else {
                i1 = i2;
                i2++;
            }
        }

        System.out.println("maximum salary of an employee:" + employees[i1].getName() + ":" + employees[i1].getSalary() + "rub.");

        //System.out.println("minimum salary of an employee:" + employees[i1].getName() + ":" + employees[i1].getSalary() + "rub.");
        //System.out.println("sum salary of an employee:" + employees[i1].getName() + ":" + employees[i1].getSalary() + "rub.");
        //System.out.println("avg salary of an employee:" + employees[i1].getName() + ":" + employees[i1].getSalary() + "rub.");


    }


}

