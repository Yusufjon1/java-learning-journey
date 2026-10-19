package Lesson19.ObjectClasses;

import java.util.Objects;
import java.util.Random;

public class Main {
    static void main(String[] args) {

        //  String object2 = generateValue();
        // isNull
        // nonNull
      /*  if (Objects.nonNull(object1)) {
            System.out.println("string obj is not null");
        } else {
            System.out.println("string obj is null");
        }*/


        // Objects.nonNull(object1) && object1.equals(object2)
      /*  if (Objects.equals(object1, object2)) {
            System.out.println("obj1 equals obj2");
        } else {
            System.out.println("obj1 is not equal with obj2");
        }*/
        // String object1 = Objects.requireNonNullElse(generateValue(), "null");
        // object1 = Objects.requireNonNullElse(object1, "null");
        // System.out.println(object1);

      /*  if (object1 == null) {
            object1 = "new value";
        }
        System.out.println(object1);*/


      /*  String username = generateValue();
        if (Objects.isNull(username)) {
            throw new RuntimeException("Username can not be empty");
        }*/

       // String username = Objects.requireNonNull(generateValue(), "Username can not be empty");

        int[] arr = new int[]{2, 4, 5, 90};
        int index = randomValue();
        System.out.println(arr[index]);
        Objects.checkIndex(index, arr.length);

       /* if (index >= arr.length)
            throw new RuntimeException("Array index out of bounds"); */

        System.out.println(arr[index]);
    }

    private static String generateValue() {
        Random random = new Random();
        return random.nextBoolean() ? null : "not null";
    }

    private static int randomValue() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
