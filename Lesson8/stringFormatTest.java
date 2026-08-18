package Lesson8;

import java.util.Random;
import java.util.Scanner;

public class stringFormatTest {
    public static void main(String[] args) {

        System.out.print("Your name ?: ");
        String name = new Scanner(System.in).nextLine();
        int age = new Random().nextInt(20, 30);
       /* String pattern = "Hello %S, Are you %d years old ?";
        String message = String.format(pattern, name, age);
        System.out.println(message);*/

        String words = "Hello %S, Are you %d years old ?";
      //  String format = words.formatted(name, age);
        String pattern2 = "Hello %S, Are you %d years old ?".formatted(name, age);
        System.out.println(pattern2);
    }
}
