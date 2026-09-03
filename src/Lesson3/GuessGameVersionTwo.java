package Lesson3;

import java.util.Scanner;

public class GuessGameVersionTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the minimum number: ");
        int min = scanner.nextInt();
        System.out.print("Enter the maximum number: ");
        int max = scanner.nextInt();
        int computer = (int) Math.round(Math.random() * (max - min)) + min;

        int tryCount = 3;

        do {
            System.out.print("Enter your number: ");

            int guessNumber = scanner.nextInt();

            if (computer == guessNumber) {
                System.out.println("You won 😄😘");
                break;
            } else {
                tryCount--;
                if (guessNumber > computer){
                    System.out.println("You have entered the bigger number");
                }else {
                    System.out.println("You have entered the smaller number");
                }
                if (tryCount <= 0) {
                    System.out.println("You lose 😒");
                    break;
                } else {
                    System.out.println("Try again 😄");
                }
            }
        } while (true);




    }
}
