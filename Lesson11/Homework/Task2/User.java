package Homework.Task2;

public class User {
    private String firstName;
    private String LastName;
    private String phoneNumber;
    private int age;
    private boolean isMale;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public User(String firstName, String lastName, String phoneNumber, int age, boolean isMale) {
        this.firstName = firstName;
        LastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.isMale = isMale;
    }

    public void displayinfo() {
        String info = "FIRSTNAME: %s, LASTNAME: %s, PHONE NUMBER: %s, AGE: %d, GENDER: %s"
                .formatted(getFirstName(), getLastName(), getPhoneNumber(), getAge(), isMale() ? "Male" : "Female");
        System.out.println(info);
    }


}
