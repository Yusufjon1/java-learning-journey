package Lesson17.variableHiding;

public class Main {
    static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ab = new B();
        System.out.println(a.x);
        System.out.println(b.x);
        System.out.println(ab.x);
        ab.hi();
    }
}
