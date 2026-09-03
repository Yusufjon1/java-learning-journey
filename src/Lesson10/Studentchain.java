package Lesson10;

public class Studentchain {
    public static void main(String[] args) {
        Student student = new Student("Akbarov Akbar", 123);

        System.out.println(student.getFullname());
        student.setFullname("Mrom Mromonov");
        System.out.println(student.getFullname());


        System.out.println(student.getStudentId());
        student.setStudentId(1234555);
        System.out.println(student.getStudentId());

    }
}
