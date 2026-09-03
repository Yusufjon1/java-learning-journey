package Lesson10;

public class Calculator {
    public double first;
    public double second;
    public String sign;
    public double result;

    public void calculate() {
        switch (sign) {
            case "+" -> result = first + second;
            case "-" -> result = first - second;
            case "/" -> result = first / second;
            case "*" -> result = first * second;
            case "%" -> result = first % second;
            default -> System.out.println("Try again later");
        }
    }

    public void printAnswer() {
        System.out.printf("%.2f %s %.2f = %.2f", first, sign, second, result);
    }
}
