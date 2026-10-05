package Lesson15.Homework1;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerCalculator {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String input1 = scanner.nextLine();

        System.out.println("Enter the next (+, -, *, /, %): ");
        String operator = scanner.nextLine();

        System.out.print("Enter the second number: ");
        String input2 = scanner.nextLine();

        try {
            BigInteger num1 = new BigInteger(input1);
            BigInteger num2 = new BigInteger(input2);
            BigInteger result;

            switch (operator) {
                case "+":
                    result = num1.add(num2);
                    System.out.println("Result " + result);
                    break;

                case "-":
                    result = num1.subtract(num2);
                    System.out.println("Result " + result);
                    break;

                case "*":
                    result = num1.multiply(num2);
                    System.out.println("Result " + result);
                    break;

                case "/":
                    if (num2.equals(BigInteger.ZERO))
                        System.out.println("can not divided to zero");
                    else {
                        result = num1.divide(num2);
                        System.out.println("Result " + result);
                    }
                    break;

                case "%":
                    if (num2.equals(BigInteger.ZERO))
                        System.out.println("can not divide zero");
                    else {
                        result = num1.remainder(num2);
                        System.out.println("Result " + result);
                    }
                    break;

                default:
                    System.out.println("unknown thing entered");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error please try again");
        }

        scanner.close();
    }
}
