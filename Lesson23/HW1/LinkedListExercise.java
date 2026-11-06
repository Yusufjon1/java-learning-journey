package Lesson23.HW1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExercise {
    private static final String MY_NAME = "Josef";

    static void main(String[] args) {
        LinkedList<String> firstList = createFirstList();
        LinkedList<String> secondList = createSecondList();

        secondList.addAll(firstList);
        printWithIterator("first list hasnt chaned", firstList);
        printWithIterator("second list and first list added", secondList);

        secondList.addFirst(MY_NAME);
        secondList.addLast(MY_NAME);
        printWithIterator("second list after my name added", secondList);


    }

    private static void printWithIterator(String title, LinkedList<String> names) {
        System.out.println(title + " (" + names.size() + " ta):");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");
    }

    private static LinkedList<String> createSecondList() {
        return new LinkedList<>(List.of( "Malika", "Otabek", "Madina", "Sherzod", "Nilufar"));
    }

    private static LinkedList<String> createFirstList() {
        return new LinkedList<>(List.of( "Ali", "Vali", "Sami", "Nodir", "Laylo",
                "Zarina", "Bobur", "Jasur", "Dilnoza", "Aziz"));
    }
}
