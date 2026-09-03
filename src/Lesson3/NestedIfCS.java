package Lesson3;

import java.util.Scanner;

public class NestedIfCS {
    public static void main(String[] args) {
        Scanner NestedIf = new Scanner(System.in);

        System.out.println("your gender (male/female -> 0/1");
        int gender = NestedIf.nextInt();

        System.out.print("Your age: ");
        int age = NestedIf.nextInt();

        // For men 60 is retirement age
        // For women 55 is retirement age

        if (gender == 0) {
            System.out.println("Congrats you are a man");
            if (age >= 60) {
                System.out.println("Enjoy your retirement ❤️");
            } else {
                int i = 60 - age;
                System.out.println(i+ "more years till your retirement");
            }
            } else if (gender == 1) {
            if (age >= 55) {
                System.out.println("Enjoy your retirement");
            }else {
                int i = 55 - age;
                System.out.println(i+ " more years till your retirement");
            }
        }else {
            System.out.println("Error");
        }
    }
    }

