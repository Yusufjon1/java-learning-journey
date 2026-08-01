package lesson5;

public class abbaHomework {
    public static void main(String[] args) {

        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("hi"));

        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("java"));
        System.out.println(withoutEnd("coding"));

        System.out.println(firstHalf("Woohoo"));
        System.out.println(firstHalf("adcdef"));
        System.out.println(firstHalf("michael1"));

        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shotl", "java"));

        System.out.println(left2("Hello"));
        System.out.println(left2("java"));
        System.out.println(left2("hi"));

        System.out.println(right2("Hello"));
        System.out.println(right2("java"));

        System.out.println(middleTwo("practice"));

        System.out.println(nTwice("hello", 2));
        System.out.println(nTwice("chocolate", 3));
        System.out.println(nTwice("chocolate", 1));

        System.out.println(middleThree("Hello"));
    }


    static String extraEnd (String str) {
        String lastTwo = str.substring(str.length() - 2);
        return lastTwo + lastTwo + lastTwo;
    }
    static String withoutEnd (String word) {
        return word.substring(1, word.length() -1);
    }
    static String firstHalf (String message) {
        return message.substring(0, message.length() / 2);
    }
    static String nonStart (String a, String b) {
        return a.substring(1) + b.substring(1);
    }
    static String left2 (String str2) {
        return str2.substring(2) + str2.substring(0, 2);
    }
    static String right2 (String right) {
        return right.substring( right.length() - 2) + right.substring(0, right.length() - 2 );
    }
    static String middleTwo (String middle) {
        return middle.substring(middle.length() / 2 - 1, middle.length() / 2 + 1);
    }
    static String nTwice (String str3, int n) {
        return str3.substring(0, n) + str3.substring(str3.length() - n);
    }
    static String middleThree (String word5) {
        return word5.substring(word5.length() / 2 - 1, word5.length() / 2 + 2);
    }
}
