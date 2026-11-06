package Lesson22.HW1;

import java.util.ArrayList;
import java.util.Random;

public class RandomListExercise {
    private static final int LIST_SIZE = 30;
    private static final int MAX_NUMBER = 100;

    static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = createRandomList(random);

        System.out.println("First list (" + numbers.size() + "  element):");
        printList(numbers);

        int randomIndex = random.nextInt(numbers.size());
        int removedValue = numbers.remove(randomIndex);

        System.out.println("\nremoved : index " + randomIndex + ", value " + removedValue);

        System.out.println("\nnew list (" + numbers.size() + "  element):");
        printList(numbers);

    }

    private static ArrayList<Integer> createRandomList(Random random) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < LIST_SIZE; i++) {
            numbers.add(random.nextInt(MAX_NUMBER) + 1);
        }
        return numbers;
    }

    private static void printList(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(i + ":" + numbers.get(i) + "  ");
        }
        System.out.println();
    }

}


