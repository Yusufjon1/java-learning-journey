package Lesson2;

public class ConversionsBetweenNumericTypes {
    public static void main(String[] args) {
       /*
        byte b = 12;
        short sh = b;
        int i = sh;
        System.out.println(b);
        System.out.println(sh);
        System.out.println(i);
        */
        int a = 123456789;
        float b = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println("------");
        int a2 = (int) b;
        System.out.println(a2);

        int c = 12;
        float d = 2F; // if one of the operands is float then result will be float
        float r1 = c + d;
        double r2 = 12 + 2D; // if one of the operands is doble then result will be double
        long r3 = 12 + 2L; // if one of the operands is long then result will be long
        int r4 = 12 + 2; // if both operands are integer then result will be the integer




    }
}
