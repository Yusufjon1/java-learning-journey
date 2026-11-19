package Exercise1Modul.ExerciseOOP;

public class Drink extends MenuItem{
    private final int volumeMl;

    public Drink(String name, double price, int volumeMl) {
        super(name, price);
        if (volumeMl <= 0) {
            throw new IllegalArgumentException("volume must be greater than zero");
        }
        this.volumeMl = volumeMl;
    }

    public int getVolumeMl() {
        return volumeMl;
    }
}
