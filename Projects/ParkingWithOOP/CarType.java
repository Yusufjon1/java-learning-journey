package Projects.ParkingWithOOP;

public class CarType {
    public static String EMPTY_SIGN = "✅";
    public static String POLICE_CAR = "🚓";
    public static String MINIBUS = "🚐";
    public static String AUTOMOBILE = "🚗";
    public static String BUS = "🚌";

    public static String findCarByName(String carType) {
        return switch (carType) {
            case "POLICE_CAR" -> POLICE_CAR;
            case "MINIBUS" -> MINIBUS;
            case "AUTOMOBILE" -> AUTOMOBILE;
            case "BUS" -> BUS;
            default -> AUTOMOBILE;
        };
    }
}
