package Lesson2;

public class RelationalOperators {
    public static void main(String[] args) {
        int x = 12;
        int y = 12;

        // == ; > ; >=; <; <= these operators always come with boolean datas

        boolean r1 = x == y;
        boolean r2 = x > y;
        boolean r3 = x >= y;
        boolean r4 = x < y;
        boolean r5 = x <= y;
        System.out.println(r1);

        int age = 18;
        int gender = 0; // male - 0; female - 1;
        boolean expression1 = age >= 18;
        boolean expression2 = gender == 0;
       //  boolean overall = expression1 && expression2; // && this operator gives true when both operands are true as well
        boolean overall = expression1 || expression2; // || this operator gives true when one of the operand is true
        System.out.println(overall);

        System.out.println(true);
        System.out.println(!true); // ! this operator gives the opposite result
        System.out.println(!false);



    }
}
