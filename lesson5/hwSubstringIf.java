package lesson5;

public class hwSubstringIf {
    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("ab"));
        System.out.println(firstTwo("X"));
        System.out.println(firstTwo(""));
    }

    public static String firstTwo(String str) {

        if (str.length() <= 2) {
            return str;
        }

        return str.substring(0, 2);

    }
}
