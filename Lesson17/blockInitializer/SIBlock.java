package Lesson17.blockInitializer;

public class SIBlock extends SuperSIBlock {
    private String field1;
    private int field2;
    private static float field3;

    static {
        field3 = 35F; // this and super keywords we can not use it, also non static fields we can not value in Static initializer block
        System.out.println("Static initializer block");
    }

    public SIBlock() {
        System.out.println("empty constructor of Static initializer block class");
    }
}
