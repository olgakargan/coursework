import Lesson21.*;

public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindor = new Gryffindor[3];
        gryffindor[0] = new Gryffindor("Harry Potter", "Slytherin", "11", "6", "8", "12", "6");
        gryffindor[1] = new Gryffindor("Hermione Granger", "Slytherin", "13", "7", "9", "11", "5");
        gryffindor[2] = new Gryffindor("Ron Weasley", "Slytherin", "14", "8", "10", "10", "4");
        }
    public static void printAllGryffindor() {
        for (Gryffindor gryffindor : Gryffindor) {
            System.out.println(gryffindor);
        }
    }
    }
    public static void main(String[] args) {
            Slytherin[] slytherin = new Slytherin[3];
            slytherin[0] = new Slytherin("Draco Malfoy", "Slytherin", "11", "6", "8", "12", "6");
            slytherin[1] = new Slytherin("Graham Montague", "Slytherin", "13", "7", "9", "11", "5");
            slytherin[2] = new Slytherin("Gregory Goyle", "Slytherin", "14", "8", "10", "10", "4");

        public static void printAllSlytherin() {
            Slytherin[] Slytherin = new Slytherin[0];
            for (Slytherin slytherin : Slytherin) {
                System.out.println(slytherin);
            }
    }


    public static void main(String[] args) {
        Hufflepuff[] hufflepuff = new Hufflepuff[3];
        hufflepuff[0] = new Hufflepuff("Zachariah Smith", "Slytherin", "15", "8", "3", "6", "8");
        hufflepuff[1] = new Hufflepuff("Cedric Diggory", "Slytherin", "13", "5", "8", "4", "7");
        hufflepuff[2] = new Hufflepuff("Justin Finch-Fletchley", "Slytherin", "10", "4", "7", "1", "6");
    }

    public static void main(String[] args) {
        Ravenclaw[] ravenclaw = new Ravenclaw[3];
        ravenclaw[0] = new Ravenclaw("Zhou Chang", "ravenclaw", "11", "6", "8", "12", "6");
        ravenclaw[1] = new Ravenclaw("Padma Patil", "ravenclaw", "13", "7", "9", "11", "5");
        ravenclaw[2] = new Ravenclaw("Marcus Belby", "ravenclaw", "14", "8", "10", "10", "4");
    }

        printAllEmployee();
        System.out.println("sum salary of an employee:" + getAndCalculateSalarySum() + "rub.");
        System.out.println(getEmployeeMinSalary());
        System.out.println(getEmployeeMaxSalary());
        System.out.println("avg salary of an employee:" + getAndCalculateAverageSalary() + "rub.");
        printFamNameSNameAllEmployee();
    }

    public static void printAllEmployee() {
        for (Hogwarts hogwarts : hogwarts) {
            System.out.println(hogwarts);
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



