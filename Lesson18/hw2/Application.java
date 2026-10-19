package Lesson18.hw2;

public class Application {

    private static Application instance;

    private Application() {
        System.out.println("App has start to work (singleton is working)");

    }

    public static Application getInstance() {
        if (instance == null) {
            instance = new Application();
        }
        return instance;
    }

    public void run() {
        System.out.println("\n--- run()  method processing ---");

        Phone phone1 = new Phone("galaxy s24", Model.SAMSUNG, 128);
        Phone phone2 = new Phone("Iphone 17 pro", Model.IPHONE, 256);
        Phone phone3 = new Phone("redmi ultra 17", Model.REDMI, 512);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
    }
}
