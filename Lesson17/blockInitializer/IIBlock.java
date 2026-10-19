package Lesson17.blockInitializer;

public class IIBlock extends SuperIIBlock {
    private String field1;
    private int field2;
    private static float field3;

    {
        this.field1 = "😊✅";
        this.field2 = 7;
        this.field3 = 12F;
        System.out.println("Instance Initializer block");
    }
    {
        System.out.println("😊😊😊🚗");
    }

    public IIBlock() {
        System.out.println("empty constructor of IIB class");
    }

    public IIBlock(int field2) {
        System.out.println(" constructor with one parameter of IIB class");
        this.field2 = field2;
    }
}
