package Lesson3;

public class DoWhileCS {
    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.println(counter*counter);
            counter++;
        }while (counter != 100);
    }
}
