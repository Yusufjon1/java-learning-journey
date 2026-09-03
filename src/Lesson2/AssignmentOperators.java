package Lesson2;

public class AssignmentOperators {
    public static void main(String[] args) {
        int x = 12;
        // x = x + 2;
        // x = x * 2;
        x += 2;
        x *= 2;
        // int y = (int)(28 + 2.4F)
        System.out.println(x);
        // 28 + 2.4F
        x += 2.4F; // x = (int)(28 + 2.4F)
        System.out.println(x);

        // impliment and decrement assignments

        int counter = 10;

        /*
        counter = counter + 1;
        System.out.println(counter);

        counter = counter + 1;
        System.out.println(counter); // instead we can use the other way which is way better and easier

        counter = counter + 1;
        System.out.println(counter);


        counter++;
        System.out.println(counter);
        counter++;
        System.out.println(counter);

        int counter1 = 10;
        counter1 --;
        System.out.println(counter1);
        counter1 --;
        System.out.println(counter1);

         */

        int a = 4;
        int b = 4;
        int c = 5;
        int d = 5;
        c = c * a++;
        d = d * ++b; // prefix assignment will be calculated first and as a result we get 25
        System.out.println(c);
        System.out.println(d);

        System.out.println(a);
        System.out.println(b);





    }
}
