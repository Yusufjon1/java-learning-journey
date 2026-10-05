package Lesson13.Homework2;

public class MyMathApp {
    static void main(String[] args) {
        MyMath myMath = new MyMath();
        int a = 12;
        int b = 12;

        double doublee = 12.5D;
        double dauble = 12.5D;

        String word = "hello";
        int inti = 11;

        String word1 = "My name is";
        double count = 1.5D;

        String string = "Hi";
        String string1 = "Wassup";

        System.out.println(myMath.add(a, b));
        System.out.println(myMath.add(doublee, dauble));
        System.out.println(myMath.add(word, inti));
        System.out.println(myMath.add(word1, count));
        System.out.println(myMath.add(string1, string));
    }

}
