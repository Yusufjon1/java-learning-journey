package Lesson3;

public class ContinueUCS {
    public static void main(String[] args) {
        int counter = 0;

        while (true) {
            counter++;

            if (counter % 2 == 0) {
                continue;
            }
            System.out.println(counter);
            if (counter > 10) {
                break;
               // return; it stops the work of main
            }
        }
       //  System.out.println("end.......");
    }
}