import java.util.Objects;

public class Employee {
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


    public void setFam(String fam) {
        this.Fam = fam;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getDepartment() == employee.getDepartment() && Float.compare(employee.getSalary(), getSalary()) == 0 && getId() == employee.getId() && Objects.equals(getFam(), employee.getFam()) && Objects.equals(getName(), employee.getName()) && Objects.equals(getSName(), employee.getSName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFam(), getName(), getSName(), getDepartment(), getSalary(), getId());
    }
}
