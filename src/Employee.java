import java.util.Objects;

public class Employee {
    public int[] getSalary;
    private String Fam;
    private String Name;
    private String SName;
    private int Department;
    private float Salary;
    private static int Counter;
    private int Id;
    //  Getters
    public int getId() {
        return this.Id;
    }

    public String getFam() {
        return this.Fam;
    }

    public String getName() {
        return this.Name;
    }

    public String getSName() {
        return this.SName;
    }

    public int getDepartment() {
        return this.Department;
    }

    public float getSalary() {
        return this.Salary;
    }
//Setters




    public void setDepartment(int dept) {
        this.Department = dept;
    }

    public void setSalary(float sal) {
        this.Salary = sal;
    }
    //Constructor
    public Employee(String fam, String name, String Sname, int dept, float sal) {
        Fam = fam;
        Name = name;
        SName = Sname;
        Department = dept;
        Salary = sal;
        Id = ++Counter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Fam='" + Fam + '\'' +
                ", Name='" + Name + '\'' +
                ", SName='" + SName + '\'' +
                ", Department=" + Department +
                ", Salary=" + Salary +
                ", Id=" + Id +
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