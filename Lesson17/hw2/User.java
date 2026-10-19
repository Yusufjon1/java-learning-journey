package Lesson17.hw2;

public class User {
    private String name;
    private String phone;
    private Location location;

    {
        this.name = "unknown user";
        this.phone = "+99893567785867";
        this.location = new Location();
    }

    public User() {
    }

    public User(String name, String phone, Location location) {
        this.name = name;
        this.phone = phone;
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", location=" + location +
                '}';
    }
}
