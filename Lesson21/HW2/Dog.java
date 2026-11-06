package Lesson21.HW2;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " gaw gaw");
    }
}
