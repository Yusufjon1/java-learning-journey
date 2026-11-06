package Lesson22.HW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookTest {
    private static final int LIST2_SIZE = 5;

    static void main(String[] args) {
        Random random = new Random();
        List<Book> list1 = createBooks();
        List<Book> list2 = pickRandomBooks(list1, LIST2_SIZE, random);

        System.out.println("=== Boshida ===");
        printBooks("list1", list1);
        printBooks("list2", list2);

        list1.removeAll(list2);

        System.out.println("\n=== list2 dagilar list1 dan o'chirilgandan keyin ===");
        printBooks("list1", list1);
        printBooks("list2", list2);
    }

    private static void printBooks(String listName, List<Book> books) {
        System.out.println(listName + " (" + books.size() + "):");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("  " + i + ": " + books.get(i));
        }
    }

    private static List<Book> pickRandomBooks(List<Book> source, int count, Random random) {
        List<Book> remaining = new ArrayList<>(source);
        List<Book> picked = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(remaining.size());
            picked.add(remaining.remove(randomIndex));
        }
        return picked;
    }

    private static List<Book> createBooks() {
        String[] titles =  {
                "Java Basics", "Clean Code", "Effective Java", "Head First Java",
                "Algorithms", "Design Patterns", "Refactoring", "Spring in Action",
                "SQL Basics", "Data Structures"
        };

        List<Book> books = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            books.add(new Book(i + 1, titles[i]));
        }
        return books;
    }
}
