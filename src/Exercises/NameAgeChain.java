package Exercises;

import java.util.Scanner;

public class NameAgeChain {
    public static void main(String[] args) {
        NameAgeTask nameAgeTask = new NameAgeTask();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        nameAgeTask.setName(scanner.nextLine());

        System.out.print("Enter your surname: ");
        nameAgeTask.setSurname(scanner.nextLine());

        System.out.print("Your age: ");
        nameAgeTask.setAge(scanner.nextInt());

        System.out.print("Your phone number: ");
        nameAgeTask.setPhoneNumber(scanner.nextInt());

        System.out.print("Are you male ? (True/False):  ");
        nameAgeTask.setIsMale(scanner.nextBoolean());

        nameAgeTask.display();

    }
}
