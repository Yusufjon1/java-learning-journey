package Lesson21.HW2;

public class Horse extends Animal{
    public Horse(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " heu haa");
    }
}
