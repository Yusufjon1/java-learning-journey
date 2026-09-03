package lesson5;

public class hwExtraFront {
    public static void main(String[] args) {

        System.out.println(extraFront("hello"));
        System.out.println(extraFront("hi"));


    }

    static String extraFront (String str) {
        if (str.length() <= 2) {
            return str + str + str;
        }
        return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }
}
