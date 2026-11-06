package Exercise1Modul;

import java.util.Scanner;

public class Exercise2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    static void main(String[] args) {
        int number = readNumber();
        printSign(number);
        printParity(number);

    }

    private static void printParity(int number) { // bu yerda raqamni odd yoki even ekanligini if/else bilan tekshirilyapti
        if (number % 2 == 0) {
            System.out.println("number is " + number + " even");
        } else {
            System.out.println("number is " + number + " odd");
        }
    }

    private static void printSign(int number) { // bu yerda raqam positive negative yokida nol ekanligi tekshiriladi
        if (number > 0) {
            System.out.println("number is " + number + " positive");
        } else if (number < 0) {
            System.out.println("number is " + number + " negative");
        } else {
            System.out.println("number is " + number + " zero");
        }
    }

    private static int readNumber() { // bu yerda userdan raqam sorab olinadi
        System.out.print("please enter the number: ");
        return SCANNER.nextInt();

    }
}
