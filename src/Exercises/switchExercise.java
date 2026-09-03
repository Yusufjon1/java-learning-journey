package Exercises;

import java.util.Scanner;

public class switchExercise {
    public static void main(String[] args) {
        System.out.println("=== ATM MAIN MENU ===");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        int choice = getUserInput("Please enter your choice (1-4): ");
        switch (choice) {
            case 1:
                System.out.println("Displaying your account balance...");
                break;
            case 2:
                System.out.println("Redirecting to deposit screen...");
                break;
            case 3:
                System.out.println("Redirecting to withdrawal screen...");
                break;
            case 4:
                System.out.println("Thank you for using our ATM. Goodbye!");
                break;
            default:
                System.out.println("Invalid option! Please select a number between 1 and 4.");
        }
    }

    static int getUserInput (String survey) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(survey);
        return scanner.nextInt();
    }
}
