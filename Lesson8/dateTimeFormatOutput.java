package Lesson8;

import java.util.Date;

public class dateTimeFormatOutput {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.printf("%tR %n", date);
        System.out.printf("%tT %n", date);
        System.out.printf("%tT %<tp %n", date);
        System.out.printf("%tc %n", date);
        System.out.println(date);
    }
}
