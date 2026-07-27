package Lesson4;

public class Fibonacci {
    public static void main(String[] args) {
        // f(n) = f(n -1) + f(n - 2)
        // f(0) = 0
        // f(1) = 1
        // f(2) = f(1) + f(0) = 1
        // f(3) = f(2) + f(1) = 2
        // f(4) = f(3) + f(2) = 3
        // f(5) = f(4) + f(3) = 5
        // f(6) = f(5) + f(4) = 8
        int fibonacci3 = fibonacci(3);
        int fibonacci4 = fibonacci(4);
        int fibonacci5 = fibonacci(5);
        System.out.println(fibonacci3);
        System.out.println(fibonacci4);
        System.out.println(fibonacci5);
    }

    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
