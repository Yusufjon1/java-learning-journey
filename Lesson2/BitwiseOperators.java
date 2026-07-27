package Lesson2;

public class BitwiseOperators {
    public static void main(String[] args) {
        // bit 4; 2; 1;
        int x = 5;
        int y = 2;
        int r1 = x | y;
        System.out.println(r1);
        int r2 = 0b110101001; // we use zero and b 0b to convert bigger bit
        System.out.println(r2);

        int r3 = x & y;
        System.out.println(r3);

        int r4 = x ^ y;
        System.out.println(r4);

        System.out.println(~2);



    }
}


