package Lesson3;

import java.util.Scanner;

public class IfCS {
    public static void main(String[] args) {
        System.out.println("Welcome to Telegram");
        System.out.println("you have simple emojis 😊");
        System.out.println("is your Telegram premium ? (yes/no -> 0/1)");
        System.out.print("Answer here: ");
        Scanner survey = new Scanner(System.in);
        int answer = survey.nextInt();
        if (answer == 0) {
            System.out.println("you will have awesome emojis too");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            number++;
        }
        System.out.println("Result " + number);

        Scanner homework1 = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int count = 0;
        int a = homework1.nextInt();
        int b = homework1.nextInt();
        int c = homework1.nextInt();

        if (a > 0) count++;
        if (b > 0) count++;
        if (c > 0) count++;

        System.out.println("The result is: " + count);

        Scanner hw = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a1 = hw.nextInt();
        int b1 = hw.nextInt();
        int c1 = hw.nextInt();
        int min = a1;
        if (min > b1) {
            min = b1;
        }
        if (min > c1) {
            min = c1;
        }
        System.out.println("The minimum number is: " + min);


    }
}
