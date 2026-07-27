package Lesson3;

public class Unicode {
    public static void main(String[] args) {
        char tm = '\u2122';
        System.out.println("Dota" + tm);
        int codePoint = 0x1F929;
        System.out.println("CodePoint + " + codePoint);
        char hs = Character.highSurrogate(codePoint);
        char ls = Character.lowSurrogate(codePoint);
        char[] item = {hs, ls};
        System.out.println(item);

        int codePoint1 = 0x1F3A2;
        System.out.println("CodePoint + " + codePoint1);
        char hs1 = Character.highSurrogate(codePoint1);
        char ls1 = Character.lowSurrogate(codePoint1);
        char[] item1 = {hs1, ls1};
        System.out.println(item1);
    }
}
