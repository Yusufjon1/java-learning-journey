package lesson.Example_2;

public class Employee {

    private String fullName;
    private double salary;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {
        System.out.println("Employee no-args called");
    }

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
        System.out.println("Employee class two argument constructor called");
    }
}
