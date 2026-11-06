package Lesson20.HW1;

public class Main {
    static void main(String[] args) {
        ProgrammingLanguage java = new ProgrammingLanguage("java", "oracle", "1995");

        ProgrammingLanguage unknown = new ProgrammingLanguage("Python", null, null);

        System.out.println(java);
        System.out.println(unknown);

        try {
            String big = unknown.getOwner().toUpperCase();
            System.out.println(big);
        } catch (NullPointerException e) {
            System.out.println("error : owner is null");
        }
        System.out.println("code worked till the end");
    }
}
