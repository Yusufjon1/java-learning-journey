package Lesson13.Homework1;

public class App {
    static void main() {
        Figure figure = new Figure();
        double a = 5;
        double b = 6;
        double c = 7;
        double d = 8;
        double e = 9;
        System.out.println(figure.calculatePerimeter(a));
        System.out.println(figure.calculatePerimeter(a, b));
        System.out.println(figure.calculatePerimeter(a, b, c));
        System.out.println(figure.calculatePerimeter(a, b, c, d, e));
    }
}
