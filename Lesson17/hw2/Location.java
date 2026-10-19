package Lesson17.hw2;

public record Location(String regionName, String districtName, int homeNumber) {
    public Location () {
        this("Toshkent shahri", "Toshkent tumani", 1);
    }
}
