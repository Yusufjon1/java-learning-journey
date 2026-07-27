package Lesson3;

public class BreakUCS {
    public static void main(String[] args) {
        int counter = 0;
        while (true){
            if (counter == 10) {
                break;
            }
            System.out.println(counter);
            counter++;
        }
    }
}
