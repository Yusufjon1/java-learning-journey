package Lesson3;

import java.util.Scanner;

public class LabelledLoop {
    public static void main(String[] args) {
      /*  pdp:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                   // break pdp;
                    continue pdp;
                }
                System.out.print(j + "  ");
            }
            System.out.println("");


        Scanner homework = new Scanner(System.in);
        System.out.print("Enter the number please: ");
        int number = homework.nextInt();

        if (number <= 0) {
            System.out.println("Please enter the right number.");
            return;
        }

        double s = 0.0;
        for (int i = 1; i <= number; i++) {
            s += 1.0 / i;
        }

        System.out.println("Overall sum s = " + s);

        Scanner homework = new Scanner(System.in);
        System.out.print("Enter the price of sweet please: ");
        double perKg = homework.nextDouble();

        if (perKg <= 0) {
            System.out.println("Please enter the right KG: ");
            return;
        }
        System.out.println("--- The price of the sweets ---");

        for (int i = 1; i < 11; i++) {
            double totalPrice = i * perKg;
            System.out.println(i + " kg = " + totalPrice);
        } */

        Scanner h1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a1 = h1.nextInt();

        System.out.print("Enter the second number: ");
        int b1 = h1.nextInt();

        if (a1 >= b1) {
            System.out.println("Error!, The first number must be smaller than second");
            return;
        }

        int sum = 0;

        for (int i = a1; i <= b1 ; i++) {
            sum += i;
        }
        System.out.println("Sum from " + a1 + " to " + b1 + " = " + sum);


        Scanner h2 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a2 = h2.nextDouble();

        System.out.print("Enter the second number: ");
        int b2 = h2.nextInt();

        if (0 >= b2) {
            System.out.println("Error!, The first number must be higher than zero");
            return;
        }
        double sum1 = 1.0;
        double sum2 = 1.0;

        for (int i = 1; i <= b2; i++) {
            sum2 *= a2;
            sum1 += sum2;
        }
        System.out.println("Overall: " + sum1);














    }
}

