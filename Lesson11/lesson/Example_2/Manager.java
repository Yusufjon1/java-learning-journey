package lesson.Example_2;

public class Manager /*child class or subclass*/
        extends Employee /*super class or parent class*/ {

    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public Manager(int bonus) {
        super();
        this.bonus = bonus;
        System.out.println("Manager one argument constructor called");
    }

    public Manager(String fullName, int bonus, int salary) {
        super(fullName, salary);
        this.bonus = bonus;
        System.out.println("Manager class three argument constructor called");
    }
}
