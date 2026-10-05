package Lesson14.Homework1;

public class Parent extends Person1{

    private String occupation;

    public Parent(String name, String phone, String occupation) {
        super(name, phone);
        this.occupation = occupation;
    }

    @Override
    public void speak() {
        System.out.println("Parent is talking");
    }

    @Override
    public void walk() {
        System.out.println("parent is walking");
    }

    @Override
    public String info() {
        return getName() + " " + getPhone() + " " + occupation;
    }
}
