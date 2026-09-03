package Lesson8;

import java.text.MessageFormat;
import java.util.Random;
import java.util.Scanner;

public class messageFormat {
    public static void main(String[] args) {
        System.out.print("Enter name: ");
        String name = new Scanner(System.in).nextLine();
        int age = new Random().nextInt(20, 30);
        String word = MessageFormat.format("Hello {0}, Are you {1} years old ?", name, age);
        System.out.println(word);
    }
}
