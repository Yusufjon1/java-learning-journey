package Lesson14;

import java.lang.Math.*;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }
}
