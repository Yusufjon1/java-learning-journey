package lesson7;

import java.util.StringTokenizer;

public class workingWithStringTokenizer {
    public static void main(String[] args) {

      /*  StringTokenizer stringTokenizer = new StringTokenizer("hello guys, how are you ?", ",", true);
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        } */

        // " ", \t, \n it separates the each tokens following that signs

        String str = "hello guys, how are you ?";
        String[] split = str.split("o");
        for (String s : split) {
            System.out.println(s);
        }

    }
}
