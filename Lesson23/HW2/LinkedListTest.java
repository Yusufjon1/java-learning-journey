package Lesson23.HW2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    static void main(String[] args) {
        demoAdding();
        demoReading();
        demoRemoving();
        demoSearching();
    }

    private static void demoSearching() {
        printTitle("searching ");
        LinkedList<String> names = new LinkedList<>(List.of("java", "python", "kotlin", "scala", "windows", "macOs"));

        print("contains ", names.contains("java"));
        print("index of", names.indexOf("python"));
        print("last index of", names.lastIndexOf("macOs"));
        print("isEmpty", names.isEmpty());
    }

    private static void demoAdding() {
        printTitle("1) adding");
        LinkedList<String> names = new LinkedList<>();
        names.add("java");
        names.add("python");
        names.add("go");
        names.add("kotlin");
        names.add("C#");
        names.add("C++");
        print("label", names);
    }

    private static void demoReading() {
        printTitle("Read and Change");
        LinkedList<String> names = new LinkedList<>(List.of("java", "python", "kotlin", "scala"));
        print("get(1)", names.get(1));
        print("getFirst", names.getFirst());
        print("getLast", names.getLast());
        print("size", names.size());

        String oldValue = names.set(1, "iphone");
        print("set(1 iphone)", oldValue);
        print("label", names);
    }

    private static void print(String label, Object value) {
        System.out.println(label + ": " + value);
    }

    private static void printTitle(String title) {
        System.out.println("\n=== " + title + " ===");
    }

    private static void demoRemoving() {
        printTitle("removing");
        LinkedList<String> names1 = new LinkedList<>(List.of("java", "python", "kotlin", "scala"));
        print("not changed version", names1);

        names1.remove(1);
        print("removing with index", names1);

        names1.remove("kotlin");
        print("removing with object", names1);

        names1.removeFirst();
        names1.removeLast();

        names1.clear();

    }
}

class User implements Comparable<User> {

    private final int age;
    private final String name;

    User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
