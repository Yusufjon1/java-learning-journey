package Lesson19.UUID;

import java.util.UUID;

public class UUIDTest {
    static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
        String uuidStringVersion = uuid.toString();
        System.out.println(uuidStringVersion);
        System.out.println(uuid.variant());
        System.out.println(uuid.version());
        UUID uuid2 = UUID.fromString("2859198a-5ff6-44d2-978a-5467ab2d285f");
        System.out.println(uuid2);
    }
}
