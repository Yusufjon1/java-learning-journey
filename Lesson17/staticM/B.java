package Lesson17.staticM;


import static Lesson17.staticM.A.field;
import static Lesson17.staticM.A.greeting;

public class B {
    static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        greeting();
       // A.greeting(); that is the second way to call without importing the static package
        field = "123";
        System.out.println(a1.field);
        System.out.println(a2.field);
        System.out.println(a3.field);
        System.out.println(a4.field);
    }
}
