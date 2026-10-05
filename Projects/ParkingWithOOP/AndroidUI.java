package Projects.ParkingWithOOP;

import java.util.Scanner;

public class AndroidUI {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Parking parking = new Parking();
        int rowCount = 4;
        int cellCount = 6;
        parking.buildPark(rowCount, cellCount);
        while (true) {

            DisplayMenu();
            String choice = readConsole("Please enter the number: ");
            switch (choice) {
                case "1" -> displayPark(parking);
                case "2" -> printMessage("Free available parking places: " + parking.getAvailableCellsCount());
                case "3" -> printMessage("Occupied parking places: " + parking.getOccupiedCellsCount());
                case "4" -> parkIn(parking);
                case "5" -> {
                    String carNumber = readConsole("Enter the car number: ");
                    boolean isUnparked = parking.unpark(carNumber);

                    if (isUnparked) {
                        System.out.println("The car is out");
                    } else {
                        System.out.println("The car not found");
                    }
                    break;
                }

                case "0" -> {
                    System.out.println("Have a nice day");
                    System.exit(0);
                }
                default -> System.out.println("Wrong choice !");
            }
        }
    }

    private static void parkIn(Parking parking) {
        String carNumber = readConsole("Car number: ");
        String carType = readConsole("Car Type: \nPOLICE_CAR/MINIBUS/AUTOMOBILE/BUS -> ");
        String rowNumber = readConsole("Please enter the row number: ");
        String columnNumber = readConsole("Please enter the column number: ");
        Car car = new Car(carNumber);
       boolean isParked = parking.park(car, carType, rowNumber, columnNumber);
       if (isParked) {
           System.out.println("Successfully parked");
       }else {
           System.out.println("This place has already taken");
       }
    }

    private static String readConsole(String hint) {
        System.out.print(hint);
        return scanner.nextLine();
    }

    private static void displayPark(Parking parking) {
        parking.displayPark();
    }


    private static Scanner DisplayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Display park              -> 1");
        System.out.println("Available cells count     -> 2");
        System.out.println("Not available cells count -> 3");
        System.out.println("In                        -> 4");
        System.out.println("Out                       -> 5");
        System.out.println("Quit                      -> 0");
        return scanner;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}

