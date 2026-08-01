package lesson6;

import java.util.Random;

public class workingWithRandom {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(12, 45);
        // first argument/param is inclusive and second argument/param is exclusive
        System.out.println(randomNumber);
        boolean nextBoolean = random.nextBoolean();
        System.out.println(nextBoolean);
    }
}
