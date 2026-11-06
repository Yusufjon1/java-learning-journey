package Exercise1Modul.ExerciseOOP;

public class MenuItem {
    private static final double EXPENSIVE_LIMIT = 8.0;

    String name;
    double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public boolean isExpensive() {
        return price > EXPENSIVE_LIMIT;
    }

    public String getDescription() {
        return name + " - " + price + " € | " + "Expensive: " + isExpensive();
    }


}
