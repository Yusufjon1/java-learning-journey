package Lesson15.BigNumbers;

import java.math.BigInteger;

public class BigIntegerTest {
    static void main(String[] args) {

        BigInteger b1 = BigInteger.valueOf(10L);
        BigInteger b2 = BigInteger.valueOf(3L);

        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.divide(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(factorial(50));

    }

    /*public static long factorial(long n) {
        if (n <= 1) {
            return n;
        }
        return n * factorial(n - 1);
    }*/

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i < n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
