package Lesson14.Homework1;

public class Teacher extends Person1{
    private String subject;

    public Teacher(String name, String phone, String subject) {
        super(name, phone);
        this.subject = subject;
    }

    @Override
    public void speak() {
        System.out.println("Teacher is speaking");
    }

    @Override
    public void walk() {
        System.out.println("Teacher is walking");
    }

    @Override
    public String info() {
        return getName() + " " + getPhone() + " " + subject;
    }
}
