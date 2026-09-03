package lesson5;

public class immutableString {
    public static void main(String[] args) {
        String message = "Java";
        System.out.println(message);
        int firstMemoryAddress = System.identityHashCode(message);

        String message2 = "G" + message.substring(1);
        System.out.println(message2);
        int changedMemoryAddress = System.identityHashCode(message2);

        System.out.println(firstMemoryAddress);
        System.out.println(changedMemoryAddress);
    }
}
