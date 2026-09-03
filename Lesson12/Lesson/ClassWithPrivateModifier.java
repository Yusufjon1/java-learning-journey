package Lesson;

public class ClassWithPrivateModifier {
    private String privateField;
    private void privateMethod() {
        System.out.println("Private method");
        System.out.println(privateField);
    }

    public void callprivateMethod() {
        privateMethod();
    }

}
