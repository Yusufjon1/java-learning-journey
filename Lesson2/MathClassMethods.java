package Lesson2;

public class MathClassMethods {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println(random);
        int a = 999;
        int b = 1;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        System.out.println(max);
        System.out.println(min);

        System.out.println(Math.abs(-100));
        System.out.println(Math.sqrt(100));
        System.out.println(Math.pow(12, 2));
        System.out.println(Math.pow(3, 1.0 / 5));
        System.out.println(Math.PI);
        System.out.println(Math.E);

        int d = 1_000_000_000;
        int g = Math.multiplyExact(d, 3); // int g = d * 3;
        System.out.println(g);
    }
}
