package lesson7;

public class immutableString {
    public static void main(String[] args) {

        String str = "Hi";
        System.out.println(str);
        str.concat(" Guys");
        System.out.println(str);
        /*
        we do not see hi guys answer when we execute because string is immutable
        and what is more runtime objects will be created in heap memory in string poll.
        All methods of string which created after object is runtime and it doesn't affect to object.
        That's why they make new object.
        */

        String str2 = "     ";
        System.out.println("str2.isBlank() = " + str2.isBlank());
        System.out.println("str2.isEmpty() = " + str2.isEmpty());
        System.out.println("HI HI HI".indexOf("HI"));
        System.out.println("Hi HI HI".lastIndexOf("HI"));
        System.out.println("HI HI HI".replace("HI", "Hello"));
    }
}
