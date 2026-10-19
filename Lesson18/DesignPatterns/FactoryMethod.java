package Lesson18.DesignPatterns;

public class FactoryMethod {

    private FactoryMethod() {
        System.out.println("calling private constructor");
    }

    public static FactoryMethod getInstance() {
        System.out.println("calling factory method");
        return new FactoryMethod();
    }
}
