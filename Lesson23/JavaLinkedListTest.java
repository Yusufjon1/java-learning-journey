package Lesson23;


import java.util.Arrays;
import java.util.LinkedList;

public class JavaLinkedListTest {
    static void main(String[] args) {
        var programmingLanguages = new LinkedList<String>();
        programmingLanguages.add("python");
        programmingLanguages.add("java");


        var languages = new LinkedList<String>();
        languages.add(0, "Scala");
        languages.add(0, "kotlin");
        languages.addAll(1, programmingLanguages);
        System.out.println(languages);

        languages.addFirst("go");
        languages.addFirst("kotlin");
        System.out.println(languages);
        // languages.remove();
        languages.remove(1);
        languages.removeLastOccurrence("kotlin");
        System.out.println(languages);
        String[] objects = languages.toArray(String[]::new);
        System.out.println(Arrays.toString(objects));
    }
}
