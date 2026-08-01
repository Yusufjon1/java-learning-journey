package lesson5;

public class stringTest {
    public static void main(String[] args) {
        String name = "Hello World";
        String newString = name.substring(6);
        System.out.println(newString);
        String newString2 = name.substring(6, 9);
        // 1 - argument -> inclusive
        // 1 - argument -> exclusive
        System.out.println(newString2);
    }
}
