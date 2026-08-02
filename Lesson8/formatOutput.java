package Lesson8;

import java.util.Random;
import java.util.Scanner;

public class formatOutput {
    public static void main(String[] args) {

        double x = 5;
        double y = x / 3;
        System.out.println(y);
        System.out.printf("%.2f %n", y);
        System.out.printf("%B %n", null);
        System.out.printf("%B %n", 123);
        System.out.printf("%b %n", false);
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Your name please: ");
        String name = scanner.nextLine();
        int age = random.nextInt(20, 30);
     //   System.out.printf("Hello %s. Are you %d years old ?%n", name, age);
        System.out.printf("Hello %2$d. Are you %1$s years old ?%n", name, age); // $ -> this shows which object should be shown first
    }
}
