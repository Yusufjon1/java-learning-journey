package Lesson18.hw1;

public class Clothes {
    private String color;
    private Gender gender;
    private Size size;

    public Clothes(String color, Gender gender, Size size) {
        this.color = color;
        this.gender = gender;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public Gender getGender() {
        return gender;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                '}';
    }
}
