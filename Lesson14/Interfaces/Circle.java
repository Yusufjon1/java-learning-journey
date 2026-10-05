package Lesson14.Interfaces;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Shape1 {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return PI * pow(radius, 2);
    }

    @Override
    public double pmt() {
        return 2 * PI * radius;
    }
}
