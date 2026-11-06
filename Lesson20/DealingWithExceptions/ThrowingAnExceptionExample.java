package Lesson20.DealingWithExceptions;

public class ThrowingAnExceptionExample {
    static void main(String[] args) throws Exception {
        m1(3);
    }

    private static void m1(int a) throws Exception {

        if (a == 2) {
            throw new Exception("a is 2 which is not acceptable");
        }
    }

    private static void m2() {

    }

    private static void m3() {

    }


}
