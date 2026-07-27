package Lesson2;

public class OperatorPrecedence {
    public static void main(String[] args) {
        byte a = 3;
        byte b = 5;
        byte c = 7;
        a += b += c; // a += (b += c); a = 15; b = 12; c = 7;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int x = 2;
        int y = 4;
        int result = x+(++y);
        System.out.println(result);


    }
}
