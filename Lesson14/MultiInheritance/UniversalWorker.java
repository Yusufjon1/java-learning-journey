package Lesson14.MultiInheritance;

public class UniversalWorker implements Teacher, Programmer{

    @Override
    public void teach() {
        System.out.println("universal worker is teaching...");
    }

    @Override
    public void writeCode() {
        System.out.println("universal worker is coding");
    }
}
