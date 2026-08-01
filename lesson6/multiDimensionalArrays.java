package lesson6;

public class multiDimensionalArrays {
    public static void main(String[] args) {

        int[][] table = new int[3][6];

        for (int i = 0; i < 3; i++) {
            int[] row = table[i];
            for (int j = 0; j < 6; j++) {
                row[j] = (int) Math.round(Math.random() * 100);
            }
        }
       /* for (int i = 0; i < 3; i++) {
            int[] row = table[i];
            for (int j = 0; j < 6; j++) {
                int element = row[j];
                System.out.print(element + "\t");
            }
            System.out.println("");*/


        for (int[] row : table) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println("");
        }

        int[][] matrix = {
                {12, 45, 354, 15, 15},
                {15, 7},
                {45, 44, 78, 12,},
                {7}
        };

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println("");
        }


    }


}

