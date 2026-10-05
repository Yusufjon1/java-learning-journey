package Lesson14.Interfaces;

import Lesson14.Shape;

public class Rectangle1 implements Shape1 {

    private double a;
    private double b;

    public Rectangle1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        return a * b;
    }

    @Override
    public double pmt() {
        return 2 * (a + b);
    }
}
