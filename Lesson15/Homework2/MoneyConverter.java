package Lesson15.Homework2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MoneyConverter {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the money (USD) : ");
        String usdAmountInput = scanner.nextLine();

        System.out.print("Enter the rate: (USD to SUM): ");
        String exchangeInput = scanner.nextLine();

        try {
            BigDecimal usdAmount = new BigDecimal(usdAmountInput);
            BigDecimal exchangeRate = new BigDecimal(exchangeInput);

            BigDecimal eurResult = usdAmount.multiply(exchangeRate);

            eurResult = eurResult.setScale(2, RoundingMode.HALF_UP);

            String resultString = eurResult.toString();

            System.out.println("Overall converted money: " + resultString);
        }  catch (NumberFormatException e ) {
            System.out.println("Please enter the numbers in right format");
        }
        scanner.close();
    }
}
