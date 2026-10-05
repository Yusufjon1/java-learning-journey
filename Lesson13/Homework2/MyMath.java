package Lesson13.Homework2;

public class MyMath {

    public int add(int a, int b) {
        System.out.println("int and int called");
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("double and double called");
        return a + b;
    }

    public String add(String a, int b) {
        System.out.println("String and int called");
        return a + b;
    }

    public String add(String a, double b) {
        System.out.println("String and double called");
        return a + b;
    }

    public String add(String a, String b) {
        System.out.println("String and String called");
        return a + b;
    }


}
