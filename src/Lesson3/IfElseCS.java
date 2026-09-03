package Lesson3;

import java.util.Scanner;

public class IfElseCS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 50) {
            System.out.println("Time to retirement 😄❤️");
        } else {
            System.out.println("Work hard :))");
        }
        System.out.println("Survey is closed");

        Scanner survey = new Scanner(System.in);
        System.out.print("How old are you ? ");
        int age1 = survey.nextInt();
        if (age1 < 12) {
            System.out.println("You are a KID");
        } else if (age1 > 12 && age1 < 19) {
            System.out.println("You are a TEENAGER");
        } else if (age1 > 19 && age1 < 29) {
            System.out.println("You are an ADULT");
        } else {
            System.out.println("Work hard");


            Scanner homework = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int number1 = homework.nextInt();
            if (number1 > 0) {
                number1++;
            } else {
                number1 -= 2;
            }
            System.out.println("Result: " + number1);

            Scanner homework2 = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int number2 = homework2.nextInt();
            if (number2 > 0) {
                number2++;
            } else if (number2 < 0) {
                number2 -= 2;
            } else number2 = 10;
            System.out.println("The result is: " + number2);

            Scanner hw3 = new Scanner(System.in);
            System.out.println("Enter two numbers: ");
            int a = hw3.nextInt();
            int b = hw3.nextInt();
            if (a > b) {
                System.out.println("the highest number is: " + a);
            } else if (b > a) {
                System.out.println("The highest number is: " + b);
            } else {
                System.out.println("Both numbers are equal");

                Scanner hw = new Scanner(System.in);
                System.out.println("Enter the three numbers: ");
                int a1 = hw.nextInt();
                int b1 = hw.nextInt();
                int c1 = hw.nextInt();
                int min1 = a1;
                if (min1 > b1) {
                    min1 = b1;
                }
                if (min1 > c1) {
                    min1 = c1;
                }
                System.out.println("The highest numbers are: ");

                if (min1 == a1) {
                    System.out.println(b1 + " and " + c1);
                } else if (min1 == b1) {
                    System.out.println(c1 + " and " + a1);
                } else {
                    System.out.println(a1 + " and " + b1);
                }


            }

        }
    }
}