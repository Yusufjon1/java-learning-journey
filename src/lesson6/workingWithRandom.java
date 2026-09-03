package lesson6;

import java.util.Random;

public class workingWithRandom {
    public static void main(String[] args) {

      Random random = new Random();
      int randomNumber = random.nextInt(12, 35);
        System.out.println(randomNumber);
      // first argument/param inclusive  second argument/param exclusive

        boolean nextBoolean = random.nextBoolean();
        System.out.println(nextBoolean);
    }
}
