package Lesson20.HW3;

public class Main {
    static void main(String[] args) {
        try {
            Home home = new Home(3, "White", 12, "Walter White");
            System.out.println(home);
        } catch (FloorCantBeLessThanZeroException | ColorCantBeNullException | RoomCountCantBelessThanTenException |
                 PersonNameCantBeBlankException e) {
            System.out.println("error " + e.getMessage());
        }


        try {
            Home home1 = new Home(-1, "black", 12, "Saul Goodman");
            System.out.println(home1);
        } catch (FloorCantBeLessThanZeroException | ColorCantBeNullException | RoomCountCantBelessThanTenException | PersonNameCantBeBlankException e) {
            System.out.println(e.getMessage());
        }


        try {
            Home home2 = new Home(1, null, 12, "Saul Goodman");
            System.out.println(home2);
        } catch (FloorCantBeLessThanZeroException | ColorCantBeNullException | RoomCountCantBelessThanTenException | PersonNameCantBeBlankException e) {
            System.out.println(e.getMessage());
        }

        try {
            Home home3 = new Home(1, "yellow", 12, "");
            System.out.println(home3);
        } catch (FloorCantBeLessThanZeroException | ColorCantBeNullException | RoomCountCantBelessThanTenException | PersonNameCantBeBlankException e) {
            System.out.println(e.getMessage());
        }


    }
}
