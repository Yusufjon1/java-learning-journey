package Projects.HotelBookingSystem;

import java.util.Scanner;

public class Hotel {
    private String hotelName;
    private Floor[] floors;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }

    public Hotel(String hotelName) {
        this.hotelName = hotelName;

    }

    public void buildHotel(int floorCount, int roomCount) {
        floors = new Floor[floorCount];
        for (int i = 0; i < floorCount; i++) {
            Floor floor = new Floor(i);
            floor.buildFloor(roomCount);
            floors[i] = floor;
        }
    }

    public void displayHotel() {
        for (Floor floor : floors) {
            System.out.print((floor.getFloorNumber() + 1) + "-floor: ");

            for (Room room : floor.getRooms()) {
                if (room.getGuest() != null) {
                    String sign = RoomType.findRoomSign(room.getRoomType());
                    System.out.print(sign);
                } else {
                    System.out.print("Free 🏡\t");
                }

            }
            System.out.println();
        }
    }


    public boolean checkIn(Guest guest, String roomType, String floorNumber, String roomNumber) {
        int fIndex = Integer.parseInt(floorNumber) - 1;
        int rIndex = Integer.parseInt(roomNumber) - 1;
        if (fIndex < 0 || fIndex >= floors.length) {
            System.out.println("FALSE FLOOR NUMBER ENTERED");
            return false;
        }

        Floor floor = floors[fIndex];
        if (rIndex < 0 || rIndex >= floors.length) {
            System.out.println("FALSE ROOM NUMBER ENTERED");
            return false;
        }

        Room room = floor.getRooms()[rIndex];
        if (room.getGuest() != null) {
            return false;
        }
        room.setGuest(guest);
        room.setRoomType(roomType);
        return true;
    }

    public static void checkIn(Hotel hotel) {
        String fullName = readConsole("Please enter your full name: ");
        String passportId = readConsole("Enter your passport ID: ");
        String phoneNumber = readConsole("Enter your phone number: ");
        String roomType = readConsole("select the room type: ");
        String floorNumber = readConsole("select the floor number: ");
        String roomNumber = readConsole("Enter the room number: ");

        Guest guest = new Guest(fullName, passportId, phoneNumber);

        boolean isCheckedIn = hotel.checkIn(guest, roomType, floorNumber, roomNumber);

        if (isCheckedIn) {
            System.out.println("Checked in ✅");
        } else {
            System.out.println("The room has already taken ❌");
        }
    }


    public boolean checkOut(String floorNumber, String roomNumber) {
        int fIndex = Integer.parseInt(floorNumber) - 1;
        int rIndex = Integer.parseInt(roomNumber) - 1;

        if (fIndex < 0 || fIndex >= floors.length) {
            return false;
        }
        Floor floor = floors[fIndex];
        if (rIndex < 0 || rIndex >= floors.length) {
            return false;
        }
        Room room = floor.getRooms()[rIndex];

        if (room.getGuest() == null) {
            return false;
        }

        room.setGuest(null);
        room.setRoomType(null);
        return true;
    }

    public static String readConsole(String survey) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(survey);
        return scanner.nextLine();
    }

    public static void checkOut(Hotel hotel) {
        String floorNumber = readConsole("Select floor number: ");
        String roomNumber = readConsole("Select room number: ");

        boolean isCheckedOut = hotel.checkOut(floorNumber, roomNumber);

        if (isCheckedOut) {
            System.out.println("CHECKED OUT ✅");
        } else {
            System.out.println("ROOM IS ALREADY FREE OR FALSE NUMBER ENTERED ❌");
        }
    }

    public void displayRoomInfo(String floorNumber, String roomNumber) {
        int fIndex = Integer.parseInt(floorNumber) - 1;
        int rIndex = Integer.parseInt(roomNumber) - 1;

        if (fIndex < 0 || fIndex >= floors.length) {
            System.out.println("WRONG FLOOR ENTERED");
            return;
        }
        Floor floor = floors[fIndex];
        if (rIndex < 0 || rIndex >= floor.getRooms().length) {
            System.out.println("WRONG ROOM NUMBER");
            return;
        }


        Room room = floor.getRooms()[rIndex];
        System.out.println("ROOM INFO");
        System.out.println("Floor: " + floorNumber + " Room " + roomNumber);

        if (room.getGuest() != null) {
            Guest guest = room.getGuest();
            String sign = RoomType.findRoomSign(room.getRoomType());
            System.out.println("RESERVED ❌ " + sign + room.getRoomType());
            System.out.println("Guest name : " + guest.getFullName1());
            System.out.println("Guest pass ID : " + guest.getPassportId());
            System.out.println("Guest phone number : " + guest.getPhoneNumber());
        }else {
            System.out.println("ROOM is free");
        }
    }

    public static void displayGuestInfo(Hotel hotel) {
        String floorNumber = readConsole("Enter floor number: ");
        String roomNumber = readConsole("Enter room number: ");
        hotel.displayRoomInfo(floorNumber, roomNumber);
    }
}
