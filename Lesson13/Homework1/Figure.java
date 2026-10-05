package Lesson13.Homework1;

public class Figure {



    public double calculatePerimeter(double a) {
        System.out.println(" double kvadrat called");
        return a * 4;
    }

    public double calculatePerimeter(double a, double b) {
        System.out.println("double, double togri tortburchak called");
        return 2 * (a + b);
    }

    public double calculatePerimeter(double a, double b, double c) {
        System.out.println("double, double uchburchak called");
        return a + b + c;
    }

    public double calculatePerimeter(double a, double b, double c, double d, double e) {
        System.out.println("double, double beshburchak called");
        return a + b + c + d + e;
    }

}
