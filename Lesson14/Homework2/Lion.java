package Lesson14.Homework2;

public class Lion implements Animal, Wild{

    @Override
    public void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    public void sound() {
        System.out.println("Sounds like a big cat");
    }

    @Override
    public void hunt() {
        System.out.println("Lion hunts ");
    }
}
