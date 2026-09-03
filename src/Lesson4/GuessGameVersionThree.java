package Lesson4;

import java.util.Scanner;

public class GuessGameVersionThree {

    public static void main(String[] args) {
        int min = GetUserInputAsInt("Enter the minimum number : ");
        int max = GetUserInputAsInt("Enter the maximum number : ");
        int number = generateNumber (min, max);
        int tryCount = 3;

        while (tryCount > 0) {
            int guessedNumber = GetUserInputAsInt("Try to find : ");

            if (guessedNumber == number) {
                System.out.println("You won 😄😄😄");
            } else {
                tryCount--;
            }
            if (tryCount > 0) {
                System.out.println("Wrong number entered. Try again :))");
                System.out.println("Remaining tries left: " + tryCount);
            }else {
                System.out.println("You lose 😒😒");
                System.out.println("The number was: " + number);
            }
        }
    }





    static int generateNumber (int min, int max) {
        return (int) Math.round(Math.random() * (max - min) + min);
    }

    static int GetUserInputAsInt (String hint) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(hint);
        return scanner.nextInt();
    }



}
