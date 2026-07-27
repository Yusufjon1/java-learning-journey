package Lesson1;

import java.io.Console;
import java.util.Scanner;

public class sccannerClass {
    public static void main(String[] args) {


       java.util.Scanner readConsole = new java.util.Scanner(System.in);

         String fullname = readConsole.nextLine();
         System.out.println(fullname);
         long a4;
         if (readConsole.hasNextLong()) {
         a4 = readConsole.nextLong(); // we can use if else statements in order to escape mismatch exceptions
         } else {
         a4 = 0;
         }
         System.out.println(a4 * 4);


        System.out.print("username: ");
        String username = readConsole.nextLine();
        System.out.print("password: ");
        String password = readConsole.nextLine();
        System.out.println("Logged in ✅");

        Console console = System.console();
        String username1 = console.readLine("username: ");


        String password1 = new String(console.readPassword("password: "));
        System.out.print(username1);
        System.out.print(" : ");
        System.out.print(password1);


        // Scanner bug

        java.util.Scanner scannerbug = new java.util.Scanner(System.in);
        System.out.println("age: ");
        int age = scannerbug.nextInt();
        scannerbug.nextLine();  // there is a bug after a int we can't use the string so we simply add new line
        System.out.println("name: ");
        String name = scannerbug.nextLine();
        System.out.println(age);
        System.out.println(name);


        Scanner name1 = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String hisName = name1.nextLine();
        System.out.println("Welcome to the world of Java, " + hisName + "!");

        Scanner age1 = new Scanner(System.in);
        System.out.print("please enter the year: ");
        int year = age1.nextInt();
        System.out.print("please enter the year you were born: ");
        int bornYear = age1.nextInt();
        int result = year - bornYear;
        System.out.println("your age: " + result);

        Scanner Rectangle = new Scanner(System.in);
        System.out.print("please enter the length: ");
        double length = Rectangle.nextDouble();
        System.out.print("please enter the width: ");
        double width = Rectangle.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("area is " + area);
        System.out.println("perimeter is " + perimeter);

        Scanner averageNumber = new Scanner(System.in);
        System.out.print("First number: ");
        double first = averageNumber.nextDouble();
        System.out.print("Second number: ");
        double second = averageNumber.nextDouble();
        System.out.print("third number: ");
        double third = averageNumber.nextDouble();
        double overall = (first + second + third) / 3;
        System.out.println("average number is " + overall);

        Scanner exchange = new Scanner(System.in);
        System.out.print("Enter the amount of money: ");
        double money = exchange.nextDouble();
        double rate = 12800;
        double sum = money * rate;
        System.out.println("Exchanged money: " + sum);

        Scanner temperature = new Scanner(System.in);
        System.out.print("Please enter the temperature: ");
        double tempo = temperature.nextDouble();
        double fahrenheit = tempo * 1.8 + 32;
        System.out.println("Farengate is: " + fahrenheit);

        Scanner logic = new Scanner(System.in);
        System.out.print("First number: ");
        int a = logic.nextInt();
        System.out.print("Second number: ");
        int b = logic.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(temp);

        Scanner radius = new Scanner(System.in);
        System.out.print("the radius: ");
        double r = radius.nextDouble();
        double area1 = Math.PI * r * r;
        System.out.println("The area is " + area1);

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("First number: ");
        int first1 = scanner1.nextInt();
        System.out.print("Second number: ");
        int second1 = scanner1.nextInt();
        int answer1 = first1 / second1;
        int answer2 = first1 % second1;
        System.out.println("First answer: " + answer1);
        System.out.println("Second answer: " + answer2);

        Scanner time = new Scanner(System.in);
        System.out.print("Overall seconds: ");
        int OverallSeconds = time.nextInt();
        int minutes = OverallSeconds / 60;
        int seconds = OverallSeconds % 60;
        System.out.println("Overall is: " + minutes + " minutes " + seconds + " seconds ");







    }
}
