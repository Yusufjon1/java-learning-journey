package lesson6;

import java.util.Arrays;

public class arrayMethods {
    public static void main(String[] args) {

      int[] array = {12, 98, 35, 67, 78, 123, 190};
       /* String str = "[";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i];                       // in order to change it to string we needed to text this whole code but there is another easier way as well
            if (i < array.length - 1) {
                str = str + ", ";
            }
        }
        str = str + "]";
        System.out.println(str); */

        String str = Arrays.toString(array);
        System.out.println(str);

       /* int[][] matrix = {
                {15, 97, 7},
                {7, 98, 45},             // that is the way how to read the matrix
                {35, 24, 61}
        };
        System.out.println(Arrays.toString(matrix));
        System.out.println(Arrays.deepToString(matrix)); */

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);                             // that is the way how we sort the arrays
        System.out.println(Arrays.toString(array));

        int index = Arrays.binarySearch(array, 123);   // that is how we find our number if there is in array and that gives us the index of that number in array
        System.out.println(index);  // and ! in order to use the binary search arrays must be sorted otherwise it doesn't work

    }
}
