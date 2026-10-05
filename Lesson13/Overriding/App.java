package Lesson13.Overriding;

public class App {
    public static void main(String[] args) {
        Shape circle = new Circle(4D);
        circle.area();
        circle.hiding();


        Shape rectangle = new Rectangle(5,5);
        rectangle.area();
        rectangle.hiding();
    }
}
