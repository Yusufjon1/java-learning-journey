package Lesson17.hw2;

public class Main {
    static void main(String[] args) {
        User defaultUser = new User();
        System.out.println("Default valued user");
        System.out.println(defaultUser);

        System.out.println();

        Location customLocation = new Location("Berlin", "Berliner strasse", 45);
        User customUser = new User("Kevin", "+4895679485", customLocation);

        System.out.println("Custom valued user");
        System.out.println(customUser);
    }
}
