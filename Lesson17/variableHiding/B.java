package Lesson17.variableHiding;

public class B extends A {
    public int x = 90;

    @Override
    public void hi() {
        System.out.println("Hello");
    }
}
