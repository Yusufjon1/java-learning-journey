package Lesson18.DesignPatterns;

public class Main {
    static void main(String[] args) {
        String newStringObject = String.valueOf(123);
        FactoryMethod factoryMethod1 = FactoryMethod.getInstance();
        FactoryMethod factoryMethod2 = FactoryMethod.getInstance();
    }
}
