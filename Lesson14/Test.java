package Lesson14;

public class Test {
    static void main(String[] args) {
        Shape circle = new Circle(12);
        Shape rectangle = new Rectangle(24,12);
        System.out.println("circle.square() = " + circle.square());
        System.out.println("rectangle.square() = " + rectangle.square());
    }

}
