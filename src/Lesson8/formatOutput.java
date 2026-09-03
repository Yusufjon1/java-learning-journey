package Lesson8;

import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

public class formatOutput {
    public static void main(String[] args) {

        double x = 1;
        double y = x / 3;
        System.out.println(y);
//        System.out.printf("%.2f %n",y);
//        System.out.printf("%b %n",true);
       /*  Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("What is your name ?: " );
        String name = scanner.nextLine();
        int age = random.nextInt(20, 30);
        System.out.printf("Hello %s, are you %d years old ? %n", name, age);
        System.out.printf("Hello %2d, are you %1s years old ? %n", name, age); */

        //  System.out.printf("%2$-5.1f %1$-8.1f %n", 12.12, 45.45);

        Book book = new Book();
        System.out.printf("%60s", book);
    }

}

class Book implements Formattable {

    private String title = "rich Dad and poor Dad";
    private String author = "***";

    @Override
    public void formatTo(Formatter formatter, int flags, int width, int precision) {
        Appendable appendable = formatter.out();
        String response = "Book[title=" + title + ", author = " + author + "]";
        int length = response.length();
        if (length < width) {
            response = "#".repeat(width - length) + response;
        }
        try {
            appendable.append(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


