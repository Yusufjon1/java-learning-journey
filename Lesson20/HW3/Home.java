package Lesson20.HW3;

public class Home {
    private int floor;
    private String color;
    private int roomCount;
    private String personName;

    public Home(int floor, String color, int roomCount, String personName)

        throws FloorCantBeLessThanZeroException,
                ColorCantBeNullException,
                RoomCountCantBelessThanTenException,
                PersonNameCantBeBlankException {

        if (floor < 0) {
            throw new FloorCantBeLessThanZeroException("Floor must not be 0 !");
        }
        if (color == null || color.isEmpty()) {
            throw new ColorCantBeNullException("Color must not be empty");
        }
        if (roomCount < 10) {
            throw new RoomCountCantBelessThanTenException("number of rooms must be at least 10");
        }
        if (personName == null || personName.isEmpty()) {
            throw new PersonNameCantBeBlankException("Name field must be filled");
        }


        this.floor = floor;
        this.color = color;
        this.roomCount = roomCount;
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "Home{" +
                "floor=" + floor +
                ", color='" + color + '\'' +
                ", roomCount=" + roomCount +
                ", personName='" + personName + '\'' +
                '}';
    }
}
