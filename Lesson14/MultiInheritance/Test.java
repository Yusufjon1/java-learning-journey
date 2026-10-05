package Lesson14.MultiInheritance;

public class Test {
    static void main(String[] args) {
      /*  Teacher teacher = new TeacherWorker();
        teacher.teach();
        Programmer programmer = new ProgrammerWorker();
        programmer.writeCode();*/

      Universal universal = new UniversalWorker2();
      universal.teach();
      universal.writeCode();
    }
}
