package lesson5;

public class stringCodeUnitsAndCodePoints {
    public static void main(String[] args) {
        String str = "java\u2122😊";
        int strLength = str.length(); // code unit
        System.out.println(strLength);
        System.out.println(str);

        // code point
        int codePointAt1 = str.codePointAt(1);
        System.out.println(codePointAt1);
    }
}
