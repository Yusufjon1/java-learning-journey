package Projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class thirdProject {

    private static List<String> history = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            displayMenu();
            System.out.print("Please choose the menu (1-5): ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> runCalculator();
                case "2" -> runMoneyConverter();
                case "3" -> runNumberConverter();
                case "4" -> runHistory();
                case "5" -> {
                    System.out.println("Have a nice day 😊");
                    System.exit(0);
                }
                default -> System.out.println("Wrong number chosen, please try again");

            }


        }
    }

    private static void displayMenu() {
        System.out.println("1 -> Calculator");
        System.out.println("2 -> Convertor money");
        System.out.println("3 -> Convertor number");
        System.out.println("4 -> History");
        System.out.println("5 -> exit");
    }

    private static void runCalculator() {
        System.out.print("Please Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the operation (+, -, *, /, %): ");
        String op = scanner.next();
        System.out.print("Please enter the second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        double result = 0;

        switch (op) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("️Cannot divide by zero!");
                    return;
                }
                result = num1 / num2;
            }
            case "%" -> result = num1 % num2;
            default -> {
                System.out.println("Invalid operation!");
                return;
            }
        }

        String output = """
                ========================================
                OPERATION: %,.2f %s %,.2f
                RESULT: %,.2f
                ========================================
                """.formatted(num1, op, num2, result);
        System.out.println(output);
        history.add(num1 + " " + op + " " + num2 + " = " + result);
    }


    private static void runMoneyConverter() {

        int currency = 0;
        int amount = 0;
        while (true) {
            currencyMenu();

            System.out.print("Please choose the currency (1-3) or main menu: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter the right number !!!");
                scanner.next();
                continue;
            }
            currency = scanner.nextInt();
            scanner.nextLine();

            if (currency == 0) {
                return;
            }

            if (currency >= 1 && currency <= 3) {
                break;
            } else {
                System.out.println("Please choose 1, 2 or 3 or main menu");
            }

        }

        while (true) {
            System.out.print("Enter the amount of money (UZS): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter the right amount of money");
                scanner.next();
                continue;
            }
            amount = scanner.nextInt();
            scanner.nextLine();

            if (amount <= 0) {
                System.out.println("Amount must be greater than 0 ");
                continue;
            }
            break;
        }


        int overall = 0;
        int remainder = 0;
        String symbol = "";
        switch (currency) {
            case 1 -> {
                overall = amount / 12600;
                remainder = amount % 12600;
                symbol = "USD";
            }
            case 2 -> {
                overall = amount / 13700;
                remainder = amount % 13700;
                symbol = "EUR";
            }
            case 3 -> {
                overall = amount / 140;
                remainder = amount % 140;
                symbol = "RUB";
            }
            default -> System.out.println("Please go to bank or try again later");
        }
        String wholeMoney = """
                ========================================
                       CURRENCY EXCHANGE
                AMOUNT: %,.2f UZS
                RESULT: %,.2f %s
                REMAINDER: %,d UZS
                ======================================== %n
                """.formatted((double) amount, (double) overall, symbol, remainder);

        System.out.println(wholeMoney);
        history.add(amount + " UZS = " + overall + " " + symbol);

    }

    private static void currencyMenu() {
        System.out.println("1 -> UZS -> USD (1 USD = 12,600 UZS)");
        System.out.println("2 -> UZS -> EUR (1 EUR = 13,700 UZS)");
        System.out.println("3 -> UZS -> RUB (1 RUB = 140 UZS)");
        System.out.println("0 -> Main menu");
    }

    private static void runNumberConverter() {
        System.out.print("Please Enter the initial number system (2, 8, 10, 16): ");
        int initial = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter the number: ");
        String number = scanner.nextLine();

        System.out.print("Please enter the target number system (2, 8, 10, 16): ");
        int intoBase = scanner.nextInt();
        scanner.nextLine();

        int decimal = Integer.parseInt(number, initial);

        String result = Integer.toString(decimal, intoBase).toUpperCase();
        System.out.println("RESULT: " + result);

        history.add(number + " (" + initial + "-base) -> " + result + " (" + intoBase + "-base)");
    }

    private static void runHistory() {
        System.out.println("\n========================================");
        System.out.println("          TRANSACTION HISTORY           ");
        System.out.println("========================================");

        if (history.isEmpty()) {
            System.out.println("No history yet!");
        } else {
            for (int i = 0; i < history.size(); i++) {
                System.out.println((i + 1) + ". " + history.get(i));
            }
        }
    }
}

