package Lesson20.ChainedExceptions;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class FinallyBlockExample {
    static void main(String[] args) {
        // m1();
        // m2();
        // System.out.println(m3());
        m4();
    }

    private static int m3() {
        try {
            return 10;
        } finally {
            return 5;
        }
    }

    private static void m2() {
        Scanner scanner = null;
        try{
            scanner = new Scanner(new File("Lesson20/ChainedExceptionExample2/file/file.txt"), StandardCharsets.UTF_8);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("error");
        } finally {
            if (scanner != null) {
                scanner.close();
            }

        }
    }

    static void m1() {
        try{
            if (new Random().nextBoolean()) {
                System.out.println("Exception");
            } else {
                System.out.println("success");
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    private static void m4() {
        try(var scanner = new Scanner(new File("Lesson20/ChainedExceptionExample2/file/file.txt"), StandardCharsets.UTF_8);){
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("error");
        }
        }
    }

