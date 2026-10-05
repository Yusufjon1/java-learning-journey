package Lesson15.BigNumbers;

import java.math.BigDecimal;

public class BigDecimalTest {
    static void main(String[] args) {
       /* double a = 2.1;
        double b = 2.2;
        System.out.println(a + b);*/

       /* BigDecimal b1 = new BigDecimal(2.1); // first way of making BigDecimal
        BigDecimal b2 = new BigDecimal(2.2);*/

     /*   BigDecimal b1 = BigDecimal.valueOf(2.1); // second way of making BigDecimal
        BigDecimal b2 = BigDecimal.valueOf(2.2);
        BigDecimal b3 = b1.add(b2);
        System.out.println(b3);
        BigDecimal b4 = BigDecimal.valueOf(12.29384756978234659);
        System.out.println(b4);*/

        BigDecimal b1 = new BigDecimal ("2.2"); // third way of making BigDecimal
        BigDecimal b2 = new BigDecimal ("2.8");
        BigDecimal b3 = b1.add(b2);
        System.out.println(b3);

        BigDecimal b4 = new BigDecimal("12.29384756978234659");
        System.out.println(b4);


    }
}
