package Lesson9;

public class KISSTest {
    public static void main(String[] args) {

        System.out.println(getDay(5));
    }

    public static String getDay (int number) {
        return switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "unknown error";
        };
    }
    public static String getDayWithKISS (int number) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "unknown error"};
        if (number > 1 || number > 7)
            return "unknown error";
        return days[number - 1];
    }
}
