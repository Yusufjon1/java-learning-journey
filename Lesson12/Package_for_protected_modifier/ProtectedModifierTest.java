package Package_for_protected_modifier;

public class ProtectedModifierTest {
    public static void main(String[] args) {

        ClassWithProtectedModifier obj = new ClassWithProtectedModifier();
      //  obj.protectedField = "123";
        obj.protectedMethod();
    }
}
