package ca.ucalgary.ensf380;

public class Professor extends Person {
    private String teacherNumber;
    private double salary;

    public Professor(String name, String phoneNumber, String emailAddress, Address address, double salary) {
        super(name, phoneNumber, emailAddress, address);
        this.teacherNumber = nextPersonalNumber((short)2);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Professor [name=" + getName() + ", teacherNumber=" + teacherNumber + ", salary=" + salary + "]";
    }

    // Getters and setters for all fields...
    // (Omitted for brevity)
    
    public String getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
