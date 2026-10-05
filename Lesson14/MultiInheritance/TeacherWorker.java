package Lesson14.MultiInheritance;

public class TeacherWorker implements Teacher{

    @Override
    public void teach() {
        System.out.println("teacher is teaching");
    }
}
