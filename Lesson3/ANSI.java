package Lesson3;

public class ANSI {
    public static void main(String[] args) {
        // ESC[38;5{ID}m
        System.out.println("\u001b[38;5;67mHello World");

        int counter = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("\u001b[38;5;" + counter + "m" + counter + "\t");
                counter++;

            }
            System.out.println("\n");

        }

    }
}
