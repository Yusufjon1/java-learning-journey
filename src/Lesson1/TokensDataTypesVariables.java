package Lesson1;

import java.io.Console;
import java.util.Scanner;

public class TokensDataTypesVariables {
    public static void main(String[] args) {
          final int A = 12; // 1 + 1 + 1 + 1 + 1 + 1 = 6 tokens

        // single line comment
        /*
        comment line 1
        comment line 2  // Multiple line comment
        cpmment line 3
         */

        /**
         *
         * @description documentation comment
         *
         */
        /*   // We can't use int when we divide the numbers to zero
        int a = 12;
        int b = 0;
        int d = a / b;
        System.out.println(d);
         */

        float a = 12F;
        float b = 0F;
        float c = a / b;
        System.out.println(c);
        System.out.println(Float.isFinite(c));

        float a1 = 0F;
        float b1 = 0F;
        float c1 = a1 / b1;
        System.out.println(c1);
        System.out.println(Float.isNaN(c1));

        double a2 = -12D;
        double b2 = 0D;
        double c2 = a2 / b2;
        System.out.println(c2);
        System.out.println(Double.isNaN(c2));

        boolean b3 = true; // true, false
        char ch = 'A';
        System.out.println(ch);

        // IDENTIFIERS

        int a1a = 12;
        int b_ = 12;
        int $c = 12;
        int asc = 12;
        boolean ident = Character.isJavaIdentifierPart('!');
        System.out.println(ident);
        boolean ident1 = Character.isJavaIdentifierStart('1');
        System.out.println(ident1);

        // CONSOLE

        String message = "Hello World 😄";
        System.out.println(message);
        System.out.println("->1");
        // System.err.println(message); // that gives us a red colour
        // System.out.print(message); // when we use this code that does not give us next free line and will be mixed with next code
        // System.out.print("->1");
    }
}
