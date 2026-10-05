package Lesson14.MultiInheritance;

public class UniversalWorker2 implements Universal{

    @Override
    public void writeCode() {
        System.out.println("universal worker coding...");
    }

    @Override
    public void teach() {
        System.out.println("universal worker is teaching....");
    }
}
