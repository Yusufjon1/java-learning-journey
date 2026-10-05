package Lesson13.Overloading;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int x = 90;
        int y = 10;
        System.out.println(calculator.sum(x, y));
        System.out.println(calculator.sum(x,  11.0)); // automatic type promotion
        System.out.println(calculator.sum(x,  12L));

        byte a = 12;
        short b = 32;
        // automatic type promotion
        System.out.println(calculator.sum(a, b));

    }
}
