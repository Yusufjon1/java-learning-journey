package Lesson18.singletonDP;

public class Singleton {

    // eager / lazy initialization

    private static Singleton instance; // new Singleton(); // eager initialization

    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
