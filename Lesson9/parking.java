package Lesson9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class parking {
    public static void main(String[] args) {


        String[][] matrix =
                {
                        {"🚕", "✅", "✅", "✅", "✅"},
                        {"✅", "✅", "✅", "✅", "✅"},
                        {"✅", "✅", "✅", "🚛", "✅"}
                };
       while (true) {
        Scanner scanner = DisplayMenu();
        System.out.print("Please enter the number: ");
        String choice = scanner.nextLine();
        switch(choice)

        {
            case "1" -> displayPark(matrix);
            case "2" -> Availablecellscount(matrix);
            case "3" -> Notavailablecellscount(matrix);
            case "4" -> In(matrix);
            case "5" -> Out(matrix);
            case "0" -> {
                System.out.println("Have a nice day");
                System.exit(0);
            }
            default -> System.out.println("Wrong choice !");
        }
       }
    }

    private static Scanner DisplayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Display park              -> 1");
        System.out.println("Available cells count     -> 2");
        System.out.println("Not available cells count -> 3");
        System.out.println("In                        -> 4");
        System.out.println("Out                       -> 5");
        System.out.println("Quit                      -> 0");
        return scanner;
    }

    private static void Availablecellscount(String[][] matrix) {
        String emptySign = "✅";
        int counter = 0;
        for (String[] row : matrix) {
            for (String cell : row) {
                if (cell.equals(emptySign)) {
                    counter++;
                }
            }
        }
        System.out.printf("Available cells count is : %5d %n",counter);
    }

    private static void Notavailablecellscount(String[][] matrix) {
        String emptySign = "✅";
        int counter = 0;
        for (String[] row : matrix) {
            for (String cell : row) {
                if (!cell.equals(emptySign)) {
                    counter++;
                }
            }
        }
        System.out.printf("Not available cells count is : %5d %n",counter);

    }

    private static void In(String[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the row number: ");
        int rowNumber = scanner.nextInt();
        System.out.print("Please enter the column number: ");
        int columnNumber = scanner.nextInt();
        if (matrix[rowNumber][columnNumber].equals("✅"))
        matrix[rowNumber][columnNumber] = "🚙";
        else {
            System.out.println("The place has already taken");
        }
    }

    private static void Out(String[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the row number: ");
        int rowNumber = scanner.nextInt();
        System.out.print("Please enter the column number: ");
        int columnNumber = scanner.nextInt();
        matrix[rowNumber][columnNumber] = "✅";
    }

    private static void Quit() {

    }



    private static void displayPark(String[][] matrix) {
        for (String[] row : matrix) {
            for (String cell : row) {
                System.out.printf("%s \t", cell);
            }
            System.out.println();
        }
    }
}
