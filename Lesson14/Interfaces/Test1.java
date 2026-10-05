package Lesson14.Interfaces;

public class Test1 {
    static void main(String[] args) {
        Shape1 circle = new Circle(12);
        System.out.println("shape1.square() = " + circle.square());
        Shape1 rectangle = new Rectangle1(12, 9);
        System.out.println("rectangle.square() = " + rectangle.square());
        System.out.println("circle.pmt() = " + circle.pmt());
        System.out.println("rectangle.pmt() = " + rectangle.pmt());
    }
}
