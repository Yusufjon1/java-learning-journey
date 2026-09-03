package lesson5;

import org.w3c.dom.ls.LSOutput;

public class stringEmptyOrNull {
    public static void main(String[] args) {

//        String word = "hi there"; // code units numbers
//        int wordLength = word.length();
//        System.out.println(wordLength);
//        if (wordLength == 0) {
//            System.out.println("word is empty");
//        }
//
//        String word2 = "";
//        if (word2 != null && word2.length() != 0) {
//            System.out.println("word2 is not empty");
//        } else {
//            System.out.println("word2 is null or empty");
//        }
//        System.out.println(makeTags("i", "Yay"));
//        System.out.println(makeTags("b", "java"));
//        System.out.println(makeTags("yay", "cite"));
//        System.out.println(makeTags("mrom", "shofiddin"));

        System.out.println(twoInOne("<<>>", "nussi"));
        System.out.println(twoInOne("<<>>", "ismalu"));
        System.out.println(twoInOne("<<>>", "shofidin"));
        System.out.println(twoInOne("[[]]", "murom"));

        System.out.println(" //---------------------------------------------");

        System.out.println(lastThree("Shoffi"));
        System.out.println(lastThree("Nussi"));
        System.out.println(lastThree("Muromi"));
        System.out.println(lastThree("Azamiy"));

        System.out.println(" //---------------------------------------------");

        System.out.println(half("Shoffi"));
        System.out.println(half("Nussii"));
        System.out.println(half("Muromi"));
        System.out.println(half("Azamiy"));

        System.out.println(" //---------------------------------------------");

        System.out.println(middleOnly("Shoffi"));
        System.out.println(middleOnly("Nussii"));
        System.out.println(middleOnly("Muromi"));
        System.out.println(middleOnly("Azamiy"));

        System.out.println(" //---------------------------------------------");

        System.out.println(shortFirst("hi", "nussi"));
        System.out.println(shortFirst("nima gap", "shoffi"));
        System.out.println(shortFirst("marazcha", "murri"));
        System.out.println(shortFirst("helloo", "world"));

        System.out.println(" //-----------------------------------------------------");

        System.out.println(whatever("Shoffi"));
        System.out.println(whatever("Nussii"));
        System.out.println(whatever("Muromi"));
        System.out.println(whatever("Azamiy"));

        System.out.println("//------------------------------------------------------");

        System.out.println(exerciseIDK("Nussii"));
        System.out.println(exerciseIDK("abuzal"));
        System.out.println(exerciseIDK("hoju"));
        System.out.println(exerciseIDK("maju"));
        System.out.println(exerciseIDK("hi"));

        System.out.println("//------------------------------------------------------");

        System.out.println(middleTwo("Nussii"));
        System.out.println(middleTwo("shofu"));
        System.out.println(middleTwo("maju"));
        System.out.println(middleTwo("haju"));
        System.out.println(middleTwo("raju"));

        System.out.println("//------------------------------------------------------");

        System.out.println(endsLy("Shofiddinly"));
        System.out.println(endsLy("majuly"));
        System.out.println(endsLy("hoju"));
        System.out.println(endsLy("y"));

        System.out.println("//--------------------------------------------------------");

        System.out.println(middleThree("shofuddin"));
        System.out.println(middleThree("Yusuf"));
        System.out.println(middleThree("Mirazam"));
        System.out.println(middleThree("Nusrate"));

        System.out.println("//--------------------------------------------------------");

        System.out.println(lastTwo("Shoffi"));
        System.out.println(lastTwo("hi"));
        System.out.println(lastTwo("azam"));
        System.out.println(lastTwo("nima"));

        System.out.println("//--------------------------------------------------------");

        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("blueTime"));
        System.out.println(seeColor("hello"));

        System.out.println("//--------------------------------------------------------");

        System.out.println(newLevel("bob"));
        System.out.println(newLevel("b9b"));
        System.out.println(newLevel("b%b"));
        System.out.println(newLevel("bAb"));
        System.out.println(newLevel("abcbob"));

        System.out.println("//--------------------------------------------------------");

        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));

        System.out.println("//--------------------------------------------------------");

        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));

        System.out.println("//--------------------------------------------------------");

        System.out.println(doubleVowel("The"));
        System.out.println(doubleVowel("AAbb"));
        System.out.println(doubleVowel("Hi-There"));

        System.out.println("//--------------------------------------------------------");

        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
        System.out.println(repeatEnd("Hello", 4));

        System.out.println("//--------------------------------------------------------");

        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
        System.out.println(frontAgain("d"));

        System.out.println("//--------------------------------------------------------");

        System.out.println(newKeyboard("Aula F75"));

   }

//    static String makeTags ( String tag, String word) {
//        return "<" + tag + ">" + word + "</" + tag + ">";
//    }

    static String twoInOne (String word, String word2) {
        return word.substring(0, 2) + word2 + word.substring(2);

    }

//-----------------------------------------------------------

    static String lastThree (String str) {
       // return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
        String lastDrei = str.substring(str.length() - 2);
        return lastDrei + lastDrei + lastDrei;
    }

    //---------------------------------------------------------

    static String half (String wort) {
        return wort.substring(0, wort.length() / 2);
    }

    //-----------------------------------------------------

    static String middleOnly (String word) {
        return word.substring(1, word.length() -1);
    }

    //-------------------------------------------------

    static String shortFirst (String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        }
        return b + a + b;
    }

    //-----------------------------------------------------

    static String whatever (String wordie) {
        return wordie.substring( wordie.length() / 2) + wordie.substring(0, wordie.length() / 2);
    }

    //------------------------------------------------------------

    static String exerciseIDK (String word) {
        return word.substring(2) + word.substring(0, 2);
    }

    //---------------------------------------------------------------

    static String middleTwo (String word) {
        return word.substring( word.length() / 2 - 1, word.length() / 2 + 1);
    }

    //-------------------------------------------------------------------

    static boolean endsLy (String word) {
        if (word.length() < 2) {
            return false;
        }

        return word.substring(word.length() - 2).equals("ly");
    }

    //-------------------------------------------------------------------

    static String middleThree (String word) {
        return word.substring(word.length() / 2 - 1, word.length() / 2 + 2);
    }

    static String lastTwo (String word) {
        return word.substring(0, word.length() - 2) + word.substring(word.length() - 1) + word.substring(word.length() - 2, word.length() - 1);
    }

    static String seeColor (String word) {
       /* if (word.startsWith("red")) {
            return true;
        } else if (word.startsWith("blue")) {
            return true;
        }
        return false; */

        if (word.startsWith("red")) {
            return "red";
        } else if (word.startsWith("blue")) {
            return "blue";
        }
        return "incorrect colour";
    }

    static boolean newLevel (String word) {
        for (int i = 0; i < word.length() - 2; i++) {
            if (word.charAt(i) == 'b' && word.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    static int countCode (String word) {
        int count = 0;
        for (int i = 0; i < word.length() - 3; i++) {
            if (word.substring( i, i + 2).equals("co") && word.substring(i + 3, i + 4).equals("e")) {
                count++;
            }
        }
        return count;
    }

    static boolean catDog (String word) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < word.length() - 2; i++) {
            if (word.substring(i, i + 3).equals("cat")) {
                catCount++;
            } else if (word.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }

    static String doubleVowel (String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result = result + word.charAt(i) + word.charAt(i);
        }
        return result;
    }
    
    static String repeatEnd (String word, int n) {
       String end = word.substring(word.length() - n);
       String result = "";
        for (int i = 0; i < n; i++) {
            result += end;
        }
        return result;
    }

    static boolean frontAgain (String word) {

        if (word.length() < 2) {
            return false;
        } else if ( word.substring(0, 2).equals(word.substring(word.length() - 2))) {
            return true;
       }
        return false;
    }

    static boolean newKeyboard (String word) {
        if (word.length() > 4) {
            return true;
        }
        return false;
    }
}
