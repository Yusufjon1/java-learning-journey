package Lesson20.HW2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 10;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number from 1 to 10:  ");
        int number = scanner.nextInt();

        try {
            int result = getNumber(array, number);
            System.out.println(number + " element" + result);
        } catch (NoFoundNumberException e) {
            System.out.println("error: " + e.getMessage());
        }
        System.out.println("system finished");
    }

    static int getNumber(int[] array, int number) throws NoFoundNumberException {
        if (number < 1 || number > 10 ) {
            throw new NoFoundNumberException("number must be from 1 to 10 !");
        }
        return array[number - 1];
    }
}
