package Lesson21.HW1;

public class Main {
    public static <T extends Comparable <T>> int compare(T a, T b) {
        return a.compareTo(b);
    }

    static void main(String[] args) {
        System.out.println(compare(10, 30));
        System.out.println(compare(10, 10));
        System.out.println(compare(10, 9));

        System.out.println(compare("vali", "Ali"));

        System.out.println(compare(1.5, 2.5));
    }
}
