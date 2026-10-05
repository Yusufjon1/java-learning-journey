package Lesson10;

import java.util.Scanner;

public class TodoChain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many activities you want to add ? : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Todo[] todos = new Todo[n];

        for (int i = 0; i < todos.length; i++) {
            System.out.println("n--- \" + (i + 1) + \"-task ---");
            todos[i] = new Todo();

            System.out.print("Name of the task : ");
            todos[i].title = scanner.nextLine();

            System.out.print("The day (for example 5) : ");
            todos[i].day = scanner.nextInt();

            System.out.print("Done ? (True/False) : ");
            todos[i].isCompleted = scanner.nextBoolean();

            System.out.print("Should be deleted ? (True/False):  ");
            todos[i].isDeleted = scanner.nextBoolean();

            scanner.nextLine();
        }

        System.out.println("""
                ========================================
                       MAVJUD VAZIFALAR RO'YXATI       \s
                ========================================
                """);

        for (int i = 0; i < todos.length; i++) {
            if (!todos[i].isDeleted) {
                todos[i].display();
            }
        }
    }
}
