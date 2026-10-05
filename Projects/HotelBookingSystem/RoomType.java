package Projects.HotelBookingSystem;

public class RoomType {
    public static final String SINGLE = "⚪";
    public static final String DOUBLE_KING = "🟢";
    public static final String LUX = "🔵";
    public static final String APARTMENT = "🔴";
    public static final String ROOM = "❌";

    public static String findRoomSign(String roomType) {

        if (roomType == null)  {
            return ROOM;
        }

        return switch (roomType.trim().toUpperCase()) {
            case "SINGLE" -> SINGLE;
            case "DOUBLE_KING" -> DOUBLE_KING;
            case "LUX" -> LUX;
            case "APARTMENT" -> APARTMENT;
            default -> ROOM;
        };
    }
}
