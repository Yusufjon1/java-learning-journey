package Lesson17.blockInitializer;

public class SuperSIBlock {
    static {
        System.out.println("Super static instance initializer block");
    }

    public SuperSIBlock() {
        System.out.println("Empty constructor of SuperSIBlock class");
    }
}
