package Lesson13.Overriding;

public class Rectangle extends Shape {
    private double a;
    private double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void area() {
        double area = a * b;
        System.out.printf("Rectangle area : %1.2f %n", area);
    }
}
