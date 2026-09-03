package Exercises;

import java.util.Scanner;

public class whileLoopExercise {
    public static void main(String[] args) {

      /*  int maxEnergy = 150;           // FIRST TASK
        int currentEnergy = 0;

        while (maxEnergy > currentEnergy) {
            int takenEnergy = getUserinput("how many energy would you like to add ? ");
            currentEnergy += takenEnergy;
            System.out.println("Current energy " + currentEnergy);
            System.out.println("--------------------------------");
        }
        System.out.println("Congrats you have reached your max energy " + currentEnergy); */


      /*  int correctPassword = 7788;                // SECOND TASK
        int incorrectPassword = 0;

        while (correctPassword != incorrectPassword) {
            incorrectPassword = getUserInput2("Please enter the password: ");
            if (incorrectPassword != correctPassword) {
                System.out.println("Incorrect password !, please try again");
            }
        }
        System.out.println("Access granted! Welcome to the system."); */


        int correctPin = 9999;
        int userPin = 0;
        int maxAttempts = 3;
        int attempts = 0;

        while (correctPin != userPin && maxAttempts > attempts) {
            userPin = getUserInput("Enter your 4-digit PIN: ");
            attempts++;
            if (correctPin != userPin && maxAttempts > attempts) {
                System.out.println("Incorrect PIN! Remaining attempts: " + (maxAttempts - attempts));
            }
        }
        if (userPin == correctPin) {
            System.out.println("PIN verified successfully! Access granted.");
        } else {
            System.out.println("Your card has been blocked! Too many incorrect attempts.");
        }
    }


   /* static int getUserinput (String survey) {         // FIRST TASK
        Scanner scanner = new Scanner(System.in);
        System.out.print(survey);
        return scanner.nextInt();
    } */

  /*  static int getUserInput2(String survey2) {           // SECOND TASK
        Scanner scanner2 = new Scanner(System.in);
        System.out.print(survey2);
        return scanner2.nextInt();
    } */

    static int getUserInput(String survey3) {
        Scanner scanner3 = new Scanner(System.in);
        System.out.print(survey3);
        return scanner3.nextInt();
    }
}
