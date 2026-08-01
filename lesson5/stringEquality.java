package lesson5;

public class stringEquality {
    public static void main(String[] args) {
       /* int a = 12;
        int b = 12;
        if (a == b) {
            System.out.println("a and b are equal");
        } else {
            System.out.println("non equal");
        }*/

        String name = "john";
        String name2 = "John";
        // == checks memory address
       /* if (name == name2) {
            System.out.println("equal");
        } else {
            System.out.println("non equal");
        }*/

        if (name.equals(name2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        String message = "Frankfurt";
        String message1 = "FRAnKfUrT";

        if (message.equalsIgnoreCase(message1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
