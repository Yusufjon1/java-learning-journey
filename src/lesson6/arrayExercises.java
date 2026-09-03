package lesson6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class arrayExercises {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10, 51);
        }

        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Overall number is " + sum);

        //----------------------------------------------------

        int[] scores = {45, 12, 89, 7, 33, 21};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        int searchResult = Arrays.binarySearch(scores, 33);
        System.out.println(searchResult);

        //------------------------------------------------------

        int[] source = {10, 20, 30, 40, 50, 60};
        int[] target = new int[6];

        System.arraycopy(source, 1, target, 2, 3);

        System.out.println(Arrays.toString(target));

        //--------------------------------------------------------

        int[][] matrix = {
                {10, 20, 30},
                {5, 15},
                {1, 2, 3, 4}
        };
        System.out.println(Arrays.deepToString(matrix));


        int totalSum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                totalSum += num;
            }
        }
        System.out.println("Overall: " + totalSum);

        //------------------------------------------------

        int[] numbers1 = {45, 12, 89, 7, 33, 21};

        int max = numbers1[0];
        int min = numbers1[0];

        for (int num : numbers1) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("The smallest number is: " + min);
        System.out.println("The biggest number is: " + max);

        //---------------------------------------------------------

        int[] original = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(original));
        int[] reversed = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversed));

        //-------------------------------------------

        int[] original1 = {1, 2, 3, 4, 5};
        int[] reversed1 = new int[original1.length];

        int j = original1.length - 1;

        for (int i = 0; i < original1.length; i++) {
            reversed1[i] = original[j];
            j--;
        }
        System.out.println(Arrays.toString(original1));
        System.out.println(Arrays.toString(reversed1));

        //-------------------------------------------------

        int[] scores1 = new int[8];
        Random random1 = new Random();

        for (int i = 0; i < scores1.length; i++) {
            scores1[i] = random1.nextInt(50, 101);
        }
        System.out.println(Arrays.toString(scores1));

        int max1 = scores1[0];
        int average = 0;

        for (int num1 : scores1) {
            average += num1;

            if (num1 > max1) {
                max1 = num1;
            }
        }

        Arrays.sort(scores1);
        System.out.println(Arrays.toString(scores1));

        int average1 = average / scores1.length;

        int[] top3 = new int[3];
        System.arraycopy(scores1, scores1.length - 3, top3, 0, 3 );


        System.out.println("The highest score is " + max1);
        System.out.println("The average score is " + average1);
        System.out.println("The top three scores are " + Arrays.toString(top3));




    }
}
