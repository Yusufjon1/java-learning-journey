package Lesson8;

import java.util.Date;
import java.util.Locale;

public class dateFormatOutput {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.printf(Locale.GERMANY, "%tB %n", date); // month that fully written
        System.out.printf(Locale.ITALIAN, "%tB, %<tA %n", date);
        System.out.printf("%tb/%<ta %n", date);
        System.out.printf("%tY %n", date); // a year
        System.out.printf("%ty %n", date); // last two digit of the year
        System.out.printf("%tj %n", date); // days of the year
        System.out.printf("%tm %n", date); // lunar calendar
        System.out.printf("%td/%<tm/%<ty %n", date);
        System.out.printf("%tA/%<td, %<tB %<tm, %<tY %<tH:%<tM:%<tS %n", date);

    }
}
