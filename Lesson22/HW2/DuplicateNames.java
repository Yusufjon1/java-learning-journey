package Lesson22.HW2;

import java.util.*;

public class DuplicateNames {
    static void main(String[] args) {
        List<String> names = createNames();

        System.out.println("first (" + names.size() + "):");
        printWithIterator(names);

        removeDuplicateNames(names);

        System.out.println("without duplicate (" + names.size() + "):");
        printWithIterator(names);
    }

    private static List<String> createNames() {
        return new ArrayList<>(List.of("Ali", "Vali", "Sami", "Ali", "Nodir",
                "Vali", "Laylo", "Ali", "Zarina", "Sami",
                "Bobur", "Laylo", "Jasur", "Nodir", "Dilnoza",
                "Bobur", "Ali", "Zarina", "Aziz", "Vali"));
    }

    private static void printWithIterator(List<String> names) {
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name + " ");
        }
        System.out.println();
    }

    private static void removeDuplicateNames(List<String> names) {
        Set<String> seenNames = new HashSet<>();
        Iterator<String> iterator =  names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            boolean isNew = seenNames.add(name);

            if (!isNew) {
                iterator.remove();
            }
        }
     }
}
