package Lesson20;

public class TipsForUsingExceptions {
    static void main(String[] args) {
        int[] arr = {1, 2};
        m1(arr);
    }

    static void m1(int[] arr) {
        int index = 1;
        if (index < arr.length) {
            System.out.println(arr[index]);
        }
    }
}
