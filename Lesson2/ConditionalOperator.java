package Lesson2;

import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        int x = 12;
        int y = 90;
        int max;
        boolean expression = x > y;
        if (expression){
            max = x;
        } else {
            max = y;
        }
        System.out.println(max);

        int x1 = 150;
        int y1 = 90;
        int max1;
        max1 = x1 > y1 ? x1 : y1;
        System.out.println(max1);

        Scanner result = new Scanner(System.in);
        System.out.print("Your overall result: ");
        int numbers = result.nextInt();
        String overall = numbers >= 50 ? "completed" : "Lose";
        System.out.println(overall);




    }
}
