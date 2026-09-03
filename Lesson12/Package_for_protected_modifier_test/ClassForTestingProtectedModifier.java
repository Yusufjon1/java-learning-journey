package Package_for_protected_modifier_test;

import Package_for_protected_modifier.ClassWithProtectedModifier;

public class ClassForTestingProtectedModifier extends ClassWithProtectedModifier {

    public ClassForTestingProtectedModifier(String protectedField) {
        super.protectedField = protectedField;
    }

    public String returnProtectedField() {
        return "->" + protectedField;
    }

    public void callProtectedMethod() {
        protectedMethod();
    }

}
