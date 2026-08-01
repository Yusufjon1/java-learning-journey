package lesson5;

public class stringConcat {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String concat = str1 + str2;
        System.out.println(concat);

        //--------------------------

        String concat2 = str1.concat(str2);
        System.out.println(concat2);
        String concat3 = str2.concat(str1);
        System.out.println(concat3);

        //---------------------------

        String message = "Hello, I'm ";
        int age = 23;
        String fullMessage = message + age;
        System.out.println(fullMessage);

    }
}
