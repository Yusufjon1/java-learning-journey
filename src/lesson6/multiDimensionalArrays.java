package lesson6;

public class multiDimensionalArrays {
    public static void main(String[] args) {

        int[][] table = new int[3][6];

      /*  for (int i = 0; i < 3; i++) {
            int[] row = table[i];
            for (int j = 0; j < 6; j++) {
                row[j] = (int) Math.round(Math.random() * 100);
            }
        }*/

       /* for (int i = 0; i < 3; i++) {
            int[] row = table[i];
            for (int j = 0; j < 6; j++) {
                int element = row[j];
                System.out.print(element + "\t");
            }
            System.out.println(""); */

        int[][] matrix = {      // jugged / nagged array
                {34, 45, 25},
                {47},
                {77, 60, 99, 12}
        };


        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;

        int[] array2 = new int[10];

       /* int[] array2 = new int[10];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        } */


        System.arraycopy(array, 2, array2, 5, 2);

        for(int i : array2) {
            System.out.println(i);
        }

    }
}




