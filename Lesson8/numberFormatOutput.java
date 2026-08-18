package Lesson8;

import java.util.Locale;

public class numberFormatOutput {
    public static void main(String[] args) {
        System.out.printf("%,d %n", 1000000);
        System.out.printf(Locale.GERMANY, "%,d %n", 1000000);
    }
}
