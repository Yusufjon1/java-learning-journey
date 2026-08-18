package Lesson9;

public class dryTest {
    public static void main(String[] args) {
        sum(12, 45);
        average(12, 45);

    }

    public static int sum (int a, int b) {
        int sum = a + b;
        System.out.printf("sum = %d %n", sum);
        return sum;
    }

    public static int average (int a, int b) {
        return sum(a, b) / 2;
    }
}
