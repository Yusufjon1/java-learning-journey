package Lesson18.hw1;

public class Main {
    static void main(String[] args) {
        var cloth1 = new Clothes("red", Gender.MALE, Size.S);
        var cloth2 = new Clothes("orange", Gender.FEMALE, Size.M);
        var cloth3 = new Clothes("white", Gender.MALE, Size.XL);

        System.out.println(cloth1);
        System.out.println(cloth2);
        System.out.println(cloth3);
    }
}
