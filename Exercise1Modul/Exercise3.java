package Exercise1Modul;

import java.util.Scanner;

public class Exercise3 {
    private static final int TABLE_SIZE = 10;
    private static final Scanner SCANNER = new Scanner(System.in);

    static void main(String[] args) {
        int number = readNumber();
        printMultiplicationTable(number);
        printSumUpTo(number);
    }

    private static void printSumUpTo(int number) { // user kiritgan raqamgacha sonlar yegilib boradi
        int sum = 0;
        for (int i = 1; i <= number; i++) { // kiritilgan raqamgacha raqam qoshilib boraveradi
            sum += i;
        }
        System.out.println("Sum from 1 to " + number + " = " + sum);
    }

    private static void printMultiplicationTable(int number) {// nu yerda kopaytirib boriladi
        for (int i = 1; i <= TABLE_SIZE; i++) {
            int answer = i * number; // readNumberdagi raqam 10 gacha sonda har biriga kopayib boradi
            System.out.println(number + " x " + i + " = " + answer);
        }
    }

    private static int readNumber() { // userdan son olinadi
        System.out.print("enter number: ");
        int userNumber = SCANNER.nextInt();


        while (userNumber <= 0) {
            System.out.println( userNumber + " is not positive, try again");
            System.out.print("enter number again: ");
            userNumber = SCANNER.nextInt();
        }
        return userNumber;
    }
}
