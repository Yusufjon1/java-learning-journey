package Lesson13.Overloading;

public class Calculator {

    public int sum(int x, int y) {
        System.out.println("int, int called");
        return x + y;
    }

    public int sum(int x, long y) {
        System.out.println("int, long called");
        return (int) (x + y);
    }

    public int sum(int x, double y) {
        System.out.println("int, double called");
        return (int) (x + y);
    }
}
