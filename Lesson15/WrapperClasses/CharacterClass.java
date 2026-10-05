package Lesson15.WrapperClasses;

public class CharacterClass {
    static void main(String[] args) {
       /* Character ch = '1';

        if (Character.isDigit(ch)) {
            System.out.println("A is digit");
        } else {
            System.out.println("A is not digit");
        }*/

//        System.out.println(Util.isValidNumber("123123dfadf"));
//        System.out.println(Util.isValidNumber("123123"));

        System.out.println(Util.isDigit("askldjfhajlk12312"));
        System.out.println(Util.isDigit("12312"));
        System.out.println(Util.isDigit("<askldjfhajlk12312"));

    }
}
