package Lesson20.DealingWithExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class checkedAndUncheckedException {
    static void main(String[] args) throws FileNotFoundException {
        // checked exception -> compile time exception
        // unchecked exception -> runtime exception
       // uncheckedException();
        System.out.println();
        System.out.println("welcome to world");
        readFile();
    }

    private static void readFile() throws FileNotFoundException {
            FileInputStream is = new FileInputStream("file.txt");
        }


    private static void uncheckedException() {
        final Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a / b);
        scanner.close();
    }

}

