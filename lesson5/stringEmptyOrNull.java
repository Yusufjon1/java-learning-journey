package lesson5;

public class stringEmptyOrNull {
    public static void main(String[] args) {

        String word = "hi there"; // code units numbers
        int wordLength = word.length();
        System.out.println(wordLength);
        if (wordLength == 0) {
            System.out.println("word is empty");
        }

        String word2 = "";
        if (word2 != null && word2.length() != 0) {
            System.out.println("word2 is not empty");
        } else {
            System.out.println("word2 is null or empty");
        }
    }
}
