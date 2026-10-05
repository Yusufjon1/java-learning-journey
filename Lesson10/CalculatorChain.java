package Lesson10;

import java.util.Scanner;

public class CalculatorChain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("First number: ");
        calc.first = scanner.nextDouble();

        System.out.print("Sign (+, -, *, /, %): ");
        calc.sign = scanner.next();

        System.out.print("Second number: ");
        calc.second = scanner.nextDouble();

        calc.calculate();
        calc.printAnswer();
    }
}
