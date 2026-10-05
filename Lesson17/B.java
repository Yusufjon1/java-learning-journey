package Lesson17;

public class B extends A {
    @Override
    public void greeting() {
        System.out.println("hi ✅✅😊");
    }

    static void main(String[] args) {
        B b = new B();
        b.greeting();
    }
}
