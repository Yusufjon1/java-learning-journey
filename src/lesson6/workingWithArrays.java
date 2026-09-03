package lesson6;

import java.util.Scanner;

public class workingWithArrays {
    public static void main(String[] args) {

        int[] array;
        array = new int[4];
        // new -> returns new address
        int index = 3;
        // min index >= 0; max index = array length -1;
        // index bounds
        //  int nthElements = array[index];
        // System.out.println(nthElements);
        
        /*
        int -> 0
        short -> 0
        long -> 0
        boolean -> false
        string -> null
         */

      /*  array[0] = 77;              // that is how to read columns with the help of for
        array[1] = 11;
        array[2] = 99;
        array[3] = 56;

        for (int i = 0; i < 4; i++) {
            System.out.println(array[i]);
        } */

      /*  Scanner scanner = new Scanner(System.in);              // here we can ask from user to enter the arrays and print them to monitor
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the column[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("First column " + array[0]);
            System.out.println("Second column " + array[1]);
            System.out.println("Third column " + array[2]);
            System.out.println("Fourth column " + array[3]);
        } */

        int arrayLength = array.length;               // here we can know how many arrays we have and array's length always returned in integer
        System.out.println(arrayLength);

       //  int[] array2 = new int[] {3, 24, 45, 598, 1654};         // 1st way of array initializer
        int[] array3 = {3, 24, 45, 598, 1654};                     // 2nd way of array initializer
       /* for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        } */

        for (int element : array3) {
            System.out.println(element);
        }
    }
}
