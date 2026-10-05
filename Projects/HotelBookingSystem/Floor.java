package Projects.HotelBookingSystem;

public class Floor {
    private int floorNumber;
    private Room[] rooms;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public void buildFloor(int roomCount) {
        rooms = new Room[roomCount];
        for (int i = 0; i < roomCount; i++) {
            Room room = new Room();
            room.setRoomNumber(i);
            rooms[i] = room;
        }
    }
}
