package Lesson13.Overriding;

public class Shape {
    public void area() {
        System.out.println("Shape area");
    }

    public Number covariantTypeTest() {
        return 21;
    }

    public static void hiding() {
        System.out.println("Shape hiding method");
    }
}
