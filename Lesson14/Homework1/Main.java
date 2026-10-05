package Lesson14.Homework1;

public class Main {
    static void main(String[] args) {
        Person1 student = new Student("john", "567", "1");
        System.out.println(student.info());

        Person1 teacher = new Teacher("sasha", "8898", "math");
        teacher.speak();

        Person1 parent = new Parent("java", "123", "jobless");
        parent.walk();
    }
}
