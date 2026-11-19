package Exercise1Modul.ExerciseOOP;

public class Food extends MenuItem {

    private final boolean vegetarian;

    public Food(String name, double price, boolean vegetarian) {
        super(name, price);
        this.vegetarian = vegetarian;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

}
