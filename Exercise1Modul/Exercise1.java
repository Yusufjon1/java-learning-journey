package Exercise1Modul;

import java.util.Scanner;

public class Exercise1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    static void main(String[] args) {
        String name = fullName();
        int age = readAge();
        String nationality = readNation();
        boolean isLearningJava = readLearningJava();

        printInfo(name, age, nationality, isLearningJava);
        printFutureAge(age);

    }

    private static void printFutureAge(int age) {
        age += 5;
        System.out.println("I will be " + age + " after 5 years");
    }

    private static void printInfo(String name, int age, String nationality, boolean isLearning) {
        String info = """
                full name : %s
                age : %d
                Nationality : %s
                do you learn Java ? : %b
                """.formatted(name, age, nationality, isLearning);
        System.out.print(info);
    }

    private static boolean readLearningJava() {
        System.out.print("do you learn Java ? True/False ");
        boolean answer = SCANNER.nextBoolean();
        if (answer) {
            System.out.println("yes I do");
        } else {
            System.out.println("no I do not");
        }
        return answer;
    }

    private static String readNation() {
        System.out.print("Nationality ? ");
        return SCANNER.nextLine();
    }

    private static int readAge() {
        System.out.print("age ? ");
        int age = SCANNER.nextInt();
        SCANNER.nextLine();
        return age;
    }

    private static String fullName() {
        System.out.print("full name ? ");
        return SCANNER.nextLine();
    }


}
