package Projects.HotelBookingSystem;

import java.util.Scanner;

public class HotelApp {
    static void main(String[] args) {
        Hotel hotel  = new Hotel("Java");
        hotel.buildHotel(4, 5);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Hotel management");
            System.out.println("Display hotel -> 1");
            System.out.println("Check in -> 2");
            System.out.println("Check out -> 3");
            System.out.println("Room info -> 4");
            System.out.println("EXIT -> 0");

            String choice = Hotel.readConsole("CHOOSE: ");

            switch (choice) {
                case "1" -> hotel.displayHotel();
                case "2" -> Hotel.checkIn(hotel);
                case "3" -> Hotel.checkOut(hotel);
                case "4" -> Hotel.displayGuestInfo(hotel);
                case "0" -> {
                    System.out.println("Have a nice day");
                    isRunning = false;
                }
                default -> System.out.println("Try again");

            }
        }





    }
}
