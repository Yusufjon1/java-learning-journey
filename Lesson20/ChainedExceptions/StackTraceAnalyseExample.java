package Lesson20.ChainedExceptions;

public class StackTraceAnalyseExample {
    static void main(String[] args) {
        factorial(2);

    }

    public static int factorial(int n) {
        System.out.printf("factorial(%d)%n", n);
        StackWalker.getInstance().forEach(stackFrame ->
                System.out.println(stackFrame.toString()));

        int r = 1;
        if (n <= 1) {
            r = 1;
        }else {
            r = r * factorial(n-1);
        }
        return r;
    }
}
