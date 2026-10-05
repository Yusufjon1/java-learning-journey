package Lesson15.WrapperClasses;

public class NumberClassTest {
    static void main(String[] args) {
      /*  Integer a = 7;
        Number integerNumber = a;
        System.out.println(integerNumber);*/

       //  Byte aByte = new Byte("7"); deprecated

      /*  Byte b1 = Byte.parseByte("7"); // primitive
        Byte b2 = Byte.valueOf("7"); // object
        byte b3 = 7;
        Byte b4 = b3;
        System.out.println(b1);
        System.out.println(b2);*/

      /*  Byte b5 = 7;
        double doubleValue = b5.doubleValue();
        System.out.println(doubleValue);*/

       /* System.out.println(Byte.decode("7"));
        System.out.println(Byte.decode("#17"));
        System.out.println(Byte.decode("0Xa"));*/
        System.out.println(Byte.parseByte("101010", 2));
        System.out.println(Byte.parseByte("17", 8));
        System.out.println(Byte.parseByte("1F", 16));

    }
}
