package Lesson20.CatchingExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionHandlingExample {
    static void main(String[] args) {

        divide(12, 0);
        System.out.println("end");

        readFile();

    }


    public static void divide(int a, int b) {

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void readFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {

        }
    }
}
