package Lesson17.finalM;

public class B extends A {

    public B(String fieldOne) {
        super(fieldOne);
    }

    @Override
    public void greeting() {
        System.out.println("hi ✅✅😊");
    }

    static void main(String[] args) {
        B b = new B("Field✅");
        b.greeting();
    }
}
