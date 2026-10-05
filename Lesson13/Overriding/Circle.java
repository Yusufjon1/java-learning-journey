package Lesson13.Overriding;

import static java.lang.Math.*;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double area = PI * pow(radius, 2);
        System.out.printf("Circle area : %10.2f%n", area);
    }

    /**
     * @return
     */
    @Override
    public Long covariantTypeTest() {
       return 12L;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void hiding() {
        System.out.println("Circle hiding method");
    }
}
