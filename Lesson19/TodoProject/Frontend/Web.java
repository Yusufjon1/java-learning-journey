package Lesson19.TodoProject.Frontend;

import Lesson19.TodoProject.Backend.DTO.TodoUpdateDTO;
import Lesson19.TodoProject.Backend.enumsAndDomain.Todo;
import Lesson19.TodoProject.Backend.services.TodoService;
import Lesson19.TodoProject.Backend.services.TodoServiceImpl;
import Lesson19.TodoProject.Backend.enumsAndDomain.Category;
import Lesson19.TodoProject.Backend.enumsAndDomain.Priority;


import java.util.Arrays;
import java.util.Scanner;

public class Web {

    private static final TodoService todoService = new TodoServiceImpl();
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        initData();

        while (true) {
            printMenu();
            System.out.print("Choose your selection: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> showAllTodos();
                case "2" -> createTodo();
                case "3" -> updateTodo();
                case "4" -> toggleTodo();
                case "5" -> deleteTodo();
                case "6" -> getTodoById();
                case "7" -> filterByCategory();
                case "0" -> {
                    System.out.println("Have a nice day");
                    return;
                }
                default -> System.out.println("Choose the right number");
            }
        }

    }

    private static void initData() {
        todoService.create(Todo.builder()
                .Title("Learning machinery")
                .Priority(Priority.HIGH)
                .Category(Category.STUDY)
                .build());
    }

    private static void filterByCategory() {
        System.out.println("Choose category: 1-WORK, 2-STUDY, 3-ENTERTAINMENT, 4-DEFAULT");
        Category category = switch (scanner.nextLine()) {
            case "1" -> Category.WORK;
            case "2" -> Category.STUDY;
            case "3" -> Category.ENTERTAINMENT;
            default -> Category.DEFAULT;
        };

        Todo[] filtered = todoService.getByCategory(category);
        System.out.println(Arrays.toString(filtered));
    }

    private static void getTodoById() {
        System.out.print("Enter ID: ");
        String searchId = scanner.nextLine();

        Todo todo = todoService.get(searchId);
        System.out.println(todo != null ? "Found ! " : "couldn't find ");
    }

    private static void deleteTodo() {
        System.out.print("Enter ID of todo you want to change: ");
        String id = scanner.nextLine();

        boolean deleted = todoService.delete(id);
        System.out.println(deleted ? "Todo deleted \uD83D\uDDD1️" : "this ID todo couldn't find ❌");
    }

    private static void toggleTodo() {
        System.out.print("Enter ID of the todo you want to change the status: ");
        String id = scanner.nextLine();

        boolean toggled = todoService.toggleCompleted(id);
        System.out.println(toggled ? "\uD83D\uDD04 Status changed " : "this ID todo couldn't find ❌");
    }

    private static void updateTodo() {
        System.out.print("Enter the ID of Todo you want to change: ");
        String id = scanner.nextLine();

        System.out.print("new title: ");
        String newTitle = scanner.nextLine();

        boolean updated = todoService.update(new TodoUpdateDTO(id, newTitle));
        System.out.println(updated ? "Todo changed ✅" : "this ID todo couldn't find ❌");
    }

    private static void createTodo() {
        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.println("Priority 1-LOW, 2-MEDIUM, 3-HIGH");
        Priority priority = switch (scanner.nextLine()) {
            case "2" -> Priority.MEDIUM;
            case "3" -> Priority.HIGH;
            default -> Priority.LOW;
        };

        System.out.println("Category: 1-WORK, 2-STUDY, 3-ENTERTAINMENT");
        Category category = switch (scanner.nextLine()) {
            case "1" -> Category.WORK;
            case "2" -> Category.STUDY;
            case "3" -> Category.ENTERTAINMENT;
            default -> Category.DEFAULT;
        };

        Todo todo = Todo.builder()
                .Title(title)
                .Priority(priority)
                .Category(category)
                .build();

        todoService.create(todo);
        System.out.println("New todo created !");
    }

    private static void showAllTodos() {
        Todo[] allTodos = todoService.getAll();
        System.out.println(Arrays.toString(allTodos));
    }

    private static void printMenu() {
        System.out.println("""
                ================ 📝 TODO MENU ================
                                1. All todos
                                2. Adding a new todo
                                3. changing the todo (Title update)
                                4. Todo status change (Done / New)
                                5. Deleting Todo (Delete)
                                6. Searching Todo by ID
                                7. Filtering by category
                                0. EXIT
                ===============================================
                """);
    }


}
