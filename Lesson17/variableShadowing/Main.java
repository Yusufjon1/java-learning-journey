package Lesson17.variableShadowing;

import static java.lang.Math.pow;

public class Main {
    private final double pi;

    public Main(double pi) {
        this.pi = pi;
    }

    public double calculateSquareOfCircle(double radius) {
        double pi = 3; // variable shadowing
        return pi * pow(radius, 2);
    }

    static void main(String[] args) {
        Main main = new Main(Math.PI);
        System.out.println(main.calculateSquareOfCircle(2));
    }
}
