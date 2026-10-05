package Lesson15.NumberConversion;

import java.util.Scanner;

import static java.lang.Math.pow;

public class NumberSystemVersionTwo {

    static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        runApp();
    }

    private static void runApp() {

        System.out.print("Enter number: ");
        String number = scanner.nextLine();

        System.out.print("Enter base index: ");
        int baseIndex = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter to index: ");
        int toIndex = Integer.parseInt(scanner.nextLine());
        if (checkBaseIndex(number, baseIndex)) {
            if (baseIndex == toIndex)
                System.out.println("Result: " + number);
            else {
                int decimelFormatNumber = Integer.parseInt(number, baseIndex);
                System.out.println("Decimel: " + decimelFormatNumber);
                CharSequence resultNumber = fromDecimelToAny(decimelFormatNumber, toIndex);
                System.out.println("Result: " + resultNumber);
            }
        } else {
            System.out.println("number is invalid");
        }
    }

    private static boolean checkBaseIndex(String number, int baseIndex) {
        for (int i = 0; i < number.length(); i++) {
            if (Character.digit(number.charAt(i), baseIndex) == -1)
                return false;
        }
        return true;
    }

    private static CharSequence fromDecimelToAny(int number, int toIndex) {

        if (toIndex == 10)
            return String.valueOf(number);

        String result = "";
        while (number >= toIndex) {
            int remainder = number % toIndex;
            number = number / toIndex;
            result = getIntegerAsChar(remainder) + result;
        }
        if (number != 0)
            result = getIntegerAsChar(number) + result;
        return result;
    }

    private static char getIntegerAsChar(int number) {
        return (char) (number + (number >= 48 && number <= 57 ? 48 : 55));
    }


}
