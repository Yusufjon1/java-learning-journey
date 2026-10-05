package Lesson14.Homework2;

public class Bird implements Animal{
    @Override
    public void eat() {
        System.out.println("Bird eats");
    }

    @Override
    public void sound() {
        System.out.println("bird sounds");
    }
}
