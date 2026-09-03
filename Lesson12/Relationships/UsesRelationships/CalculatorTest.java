package Relationships.UsesRelationships;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        double sum = calculator.sum(12, 45);
        System.out.println("sum = " + sum);
    }
}
