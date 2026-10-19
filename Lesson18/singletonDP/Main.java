package Lesson18.singletonDP;

public class Main {
    static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(System.identityHashCode(singleton1));
        System.out.println(System.identityHashCode(singleton2));

    }
}
