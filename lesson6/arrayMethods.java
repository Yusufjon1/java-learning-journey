package lesson6;

import java.util.Arrays;

public class arrayMethods {
    public static void main(String[] args) {

        int[] array = {19, 18, 7, 90, 10, 15, 99, 8, 33};
      /*  String str = "[";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i];
            if (i < array.length - 1) {
                str = str + ", ";
            }
        }
        str = str + "] ";
        System.out.println(str);*/

        String str = Arrays.toString(array);
        System.out.println(str);

        int[][] matrix = {
                {12, 90, 85},
                {35, 16, 77},
                {77, 97, 15},
        };
        System.out.println(Arrays.toString(matrix));
        System.out.println(Arrays.deepToString(matrix));

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array, 199); // we can use the binary search when arrays are sorted
        System.out.println(index);
    }
}
