package Projects.HotelBookingSystem;

public class Room {
    private int roomNumber;
    private Guest guest;
    private String roomType;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room(int roomNumber, Guest guest, String roomType) {
        this.roomNumber = roomNumber;
        this.guest = guest;
        this.roomType = roomType;
    }

    public Room() {
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", guest='" + guest + '\'' +
                '}';
    }
}
