package Projects;

import java.util.Scanner;

public class firstProject {
    public static void main(String[] args) {

        int correctPin = 7777;
        double balance = 1000.0;
        int maxAttempts = 3;
        int attempts = 0;
        boolean isAuthenticated = false;

        while (!isAuthenticated && maxAttempts > attempts) {
            int enteredPin = getUserInput("Enter your 4-digit PIN: ");
            attempts++;
            if (enteredPin == correctPin) {
                isAuthenticated = true;
                System.out.println("PIN verified successfully! Access granted.");
            } else {
                int remainingAttempts = maxAttempts - attempts;
                System.out.println("Incorrect PIN! Remaining attempts: " + remainingAttempts);
            }
        }
        if (!isAuthenticated) {
            System.out.println("Your card has been blocked! Too many incorrect attempts.");
        }
        if (isAuthenticated) {
            int choice = 0;
            int amount = 0;
            int transactionCount =0;

            do {
                System.out.println("=== ATM FINANCIAL SYSTEM ===");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Mini-Statement");
                System.out.println("5. Exit");

                choice = getUserInput("Select an option (1-5): ");

                switch (choice) {
                    case 1:
                        System.out.println("Current Balance: " + balance);
                        break;
                    case 2:
                        amount = getUserInput("Enter deposit amount ($): ");
                        if (amount > 0) {
                            balance += amount;
                            transactionCount++;
                            System.out.println("Successfully deposited $ " + amount);
                        } else {
                            System.out.println("Invalid amount! Deposit must be greater than 0.");
                        }
                        break;
                    case 3:
                        amount = getUserInput("Enter withdrawal amount ($): ");
                        if (amount <= 0) {
                            System.out.println("Invalid amount!");
                        } else if (amount > balance) {
                            System.out.println("Insufficient funds! Your balance is $ " + balance);
                        } else {
                            balance -= amount;
                            transactionCount++;
                            System.out.println("Successfully withdrew $ " + amount);
                        }
                        break;
                    case 4:
                        System.out.println("--- Mini Statement ---");
                        System.out.println("total successful transactions today: " + transactionCount);
                        if (transactionCount == 0) {
                            System.out.println("No transactions performed yet.");
                        } else for (int i = 1; i <= transactionCount; i++) {
                            System.out.println("Transaction # " + i + " : Processed successfully.");
                        }
                        break;
                    case 5:
                        System.out.println("Thank you for using our ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option! Please select between 1 and 5.");
                }
            } while (choice != 5);
        }
    }

    static int getUserInput(String survey) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(survey);
        return scanner.nextInt();
    }
}
