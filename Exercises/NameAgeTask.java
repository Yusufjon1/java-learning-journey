package Exercises;

public class NameAgeTask {
    private String name;
    private String surname;
    private int phoneNumber;
    private int age;
    private boolean isMale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
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

    public void setIsMale (boolean isMale) {
        this.isMale = isMale;
    }

    public void display() {
        System.out.printf("""
                NAME: %s
                SURNAME: %s
                AGE: %d
                PHONE NUMBER: %d
                SEX: %s
                """, name, surname, age, phoneNumber, isMale ? "Male" : "Female");
    }


}
