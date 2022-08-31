package Lesson21;

public class Hogwarts {
    private String name;
    private String faculty;

    public Hogwarts(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Hogwarts() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
