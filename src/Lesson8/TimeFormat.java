package Lesson8;

import java.util.Date;

public class TimeFormat {
    public static void main(String[] args) {

        Date date = new Date();
       // System.out.println(date);

        System.out.printf("%tH:", date); // 24 hour format
        System.out.printf("%tM:", date); // minute
        System.out.printf("%tS %n", date); // seconds
        System.out.printf("%tI:", date); // 12 hour format
        System.out.printf("%tM:", date); // minute
        System.out.printf("%tS %n", date); // seconds

       // System.out.printf("%tH:%tM:%tS", date, date, date); // overall
        System.out.printf("%tH:%<tM:%<tS %<Tp", date);
    }
}
