package Lesson4;

public class MethodDefinitionExample {
    public static void main(String[] args) {
        // call method
        int addMethodResponse = add(12, 188);
        System.out.println(addMethodResponse);
        hello();

    }

     static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    static void hello() {
        System.out.println("Hello");
    }



}
