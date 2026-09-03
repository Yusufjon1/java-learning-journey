package Lesson2;

public class shiftingOperators {
    public static void main(String[] args) {
        int x = 0b0011001; // 25
        System.out.println(x);
        int r1 = x << 1; // left shifting means we take one number from left and add one 0 to right
        System.out.println(r1);
        System.out.println(0b0110010);

        int r2 = x >> 1; // right shifting is we take a number right and add 0 to the left
        System.out.println(r2);
        System.out.println(0b0001100);




    }
}
