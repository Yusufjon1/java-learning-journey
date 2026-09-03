package Lesson3;

import java.util.Scanner;

public class GuessGameVersionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 5;
        int computer = (int) Math.round(Math.random() * (max - min)) + min;
        System.out.print("Enter your number: ");
        int guessNumber = scanner.nextInt();

        if (computer == guessNumber) {
            System.out.println("You won 😄😘");
        }else {
            System.out.println("You lose 😒");
        }




    }
}
