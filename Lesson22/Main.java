package Lesson22;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(10);

        String java = "java";
        String python = "python";
        String scala = "scala";


        languages.add(java);
        languages.add(python);
        languages.add(scala);

        System.out.println(languages);
    }
}
