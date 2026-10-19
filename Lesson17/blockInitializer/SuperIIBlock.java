package Lesson17.blockInitializer;

public class SuperIIBlock {

    {
        System.out.println("Super instance initializer block");
    }

    public SuperIIBlock() {
        System.out.println("Empty constructor of SuperIIBlock class");
    }
}
