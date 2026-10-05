package Lesson15.NumberConversion;

import java.util.Scanner;

import static java.lang.Math.pow;

public class NumberSystemVersionOne {

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

        int decimelFormatNumber = fromAnyToDecimel(baseIndex, number);
        System.out.println("Decimel: " + decimelFormatNumber);
        CharSequence resultNumber = fromDecimelToAny(decimelFormatNumber, toIndex);
        System.out.println("Result: " + resultNumber);
    }

    private static CharSequence fromDecimelToAny(int number, int toIndex) {

        StringBuilder builder = new StringBuilder("");
        while (number >= toIndex) {
            int remainder = number % toIndex;
            number = number / toIndex;
            builder = builder.append(getIntegerAsChar(remainder));
        }
        if (number != 0)
            builder = builder.append(getIntegerAsChar(number));
        builder.reverse();
        return builder;
    }

    private static char getIntegerAsChar(int number) {
        return (char) (number + (number >= 48 && number <= 57 ? 48 : 55));
    }

    private static int fromAnyToDecimel(int baseIndex, String number) {
        // 123 -> 1*8^2 + 2*8^1 + 3*8^0
        // 210
        int length = number.length();
        int multiplier = length - 1;
        double result = 0;
        for (int i = 0; i < length; i++)
            result += getCharAsInteger(number.charAt(i)) * pow(baseIndex, multiplier--);
        return (int) result;
    }

    private static int getCharAsInteger(char ch) {
        return  (ch >= 48 && ch <= 57 ? 48 : 55);

    }
}
