package lesson7;

public class workingWithStrings {
    public static void main(String[] args) {

        int a = 12;
        String str = "Hello"; // first way to make a string object
        String str2 = new String("Hello"); // second way to make a string object
        char[] array = new char[] {'H', 'e', 'l', 'l', 'o'}; // third way to make a string object
        String str3 = new String(array);

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }
}
