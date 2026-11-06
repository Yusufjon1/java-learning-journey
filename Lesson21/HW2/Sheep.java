package Lesson21.HW2;

public class Sheep extends Animal{
    public Sheep(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meee meeee");
    }
}
