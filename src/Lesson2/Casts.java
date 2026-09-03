package Lesson2;

public class Casts {
    public static void main(String[] args) {
        // (narrowing casting manual casting)
        short sh = 132;
        byte b = (byte) sh;
        long l = 1231231;
        int i = (int) l;
        System.out.println(b);
        System.out.println(i);
    }
}
