package Lesson14.Homework1;

public class Student extends Person1 {

    private String groupName;

    public Student(String name, String phone) {
        this(name, phone, "Unknown");
    }

    @Override
    public void speak() {
        System.out.println("Student is speaking...");
    }

    @Override
    public void walk() {
        System.out.println("Student is walking");
    }

    public Student(String name, String phone, String groupName) {
        super(name, phone);
        this.groupName = groupName;
    }

    @Override
    public String info() {
        return getName()+ " " + getPhone() + " " + groupName;
    }

}

