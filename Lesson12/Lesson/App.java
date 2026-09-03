package Lesson;
import Lesson.ClassWithPublicModifier;
import Package_for_protected_modifier.ClassWithProtectedModifier;
import Package_for_protected_modifier_test.ClassForTestingProtectedModifier;
import Packeage_for_default_modifier.ClasDefaultModifier;

public class App {
    public static void main(String[] args) {

      /*  ClassWithPublicModifier obj = new ClassWithPublicModifier();
        obj.publicField = "Public Field";
        obj.publicMethod();*/

      /*  ClassForTestingProtectedModifier obj = new ClassForTestingProtectedModifier("Random text");
        System.out.println(obj.returnProtectedField());
        obj.callProtectedMethod();*/

        ClasDefaultModifier obj = new ClasDefaultModifier();


    }
}
