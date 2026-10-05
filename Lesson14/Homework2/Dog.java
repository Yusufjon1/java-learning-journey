package Lesson14.Homework2;

public class Dog implements Animal, Pet{
    @Override
    public void eat() {
        System.out.println("dog eats ");
    }

    @Override
    public void sound() {
        System.out.println("dog sounds");
    }

    @Override
    public void play() {
        System.out.println("dog plays");
    }
}
