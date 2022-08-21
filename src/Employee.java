import java.util.Objects;

public class Employee {


    private String fam;
    private String name;
    private String sName;
    private int department;
    private float salary;
    private static int counter;
    private int id;


    public String getFam() {
        return this.fam;
    }

    public String getName() {
        return this.name;
    }

    public String getSName() {
        return this.sName;
    }

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.salary;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(int dept) {
        this.department = dept;
    }

    public void setSalary(float sal) {
        this.salary = sal;
    }

    //Constructor
    public Employee(String fam, String name, String sName, int dept, float sal) {
        this.fam = fam;
        this.name = name;
        this.sName = sName;
        this.department = dept;
        this.salary = sal;
        id = ++counter;
    }

    public static void printAllEmployee() {
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Fam='" + fam + '\'' +
                ", Name='" + name + '\'' +
                ", SName='" + sName + '\'' +
                ", Department=" + department +
                ", Salary=" + salary +
                ", Id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int hash = Objects.hash(getFam(), getName(), getSName(), getDepartment(), getSalary(), getId());
        return hash;
    }


}