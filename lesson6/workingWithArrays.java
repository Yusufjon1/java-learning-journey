package lesson6;

import java.util.Scanner;

public class workingWithArrays {
    public static void main(String[] args) {

        int[] array; // reference
        array = new int[4];
        // new -> return memory adress
        int index = 4;
        // min index => 0; max index = array length - 1;
        // index bounds
        //  int nthElement = array[index];
        //  System.out.println(nthElement);

        array[0] = 90;
        array[1] = 19;
        array[2] = 91;
        array[3] = 9;
        int[] array2 = new int[10];
        System.arraycopy(array, 0, array2, 5, 1);

       /* for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }*/
        for (int i : array2) {
            System.out.println(i);
        }

      /*  for (int i = 0; i < 4; i++) {
            System.out.println(array[i]);*/

      /*  Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Array[" +i+ "] = " );
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Array[" +i+ "] = " + array[i]);
        }*/

      /*  int arrayLength = array.length;
        System.out.println(arrayLength);

        array = new int[10];
        System.out.println(array.length);
        // int[] array2 = new int[]{3, 12, 96, 45, 14};
        int[] array3 = {3, 12, 96, 7, 45, 19};
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);

            for (int element : array3) {
                System.out.println(element);
            }
        }
*/

    }
}
