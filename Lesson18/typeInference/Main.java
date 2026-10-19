package Lesson18.typeInference;

// private var field // exception

public class Main {
    static void main(String[] args) {
        var a = 12.5;
        var b = "Hello world";
        System.out.println(a);
        System.out.println(b);
        System.out.println(b.toUpperCase());

        // var c = new ArrayList<>();
        // var d; // exception
        // var a = null; // exception
        // List<var> languages = new ArrayList<>(); // exception
        // List<> languages = new ArrayList<var>(); // exception
        // var<var> a2 = 123; // exception

       // List<String> l = new ArrayList<>();
       // var l2  = new ArrayList<Integer>(); // must show the variable

       /* public static var add(var a, var b) { // exception
            return a + b;
        }*/

    }
}
