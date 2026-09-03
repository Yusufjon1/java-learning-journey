package lesson7;

import java.util.Arrays;

public class stringExercises {
    public static void main(String[] args) {

        String rawText = "     Java is GREAT and java IS fun     ";
        System.out.println(rawText.trim().toLowerCase());

        String cleanedText = rawText.trim().toLowerCase();

        System.out.println("The cleaned text is: " + cleanedText);

        String[] words = cleanedText.split(" ");
        System.out.println(Arrays.toString(words));
        int count = 0;
        for (String word : words) {
            if (word.equals("java")) {
                count++;
            }
        }
        System.out.println("Overall java words: " + count);

        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        System.out.println("Reversed text: " + sb.toString().trim());

        System.out.println(" //-----------------------------------------------------------------");

        String text = "        Madam and Anna took a Kayak to see Radar              ";
        String cleanText = text.toLowerCase().trim();

        String[] words1 = cleanText.split(" ");
        System.out.println(Arrays.toString(words1));

        int palindromeCount = 0;

        StringBuilder result = new StringBuilder();

        for (String word : words1) {
            String reversed = new StringBuilder(word).reverse().toString();
            if (word.equals(reversed)) {
                palindromeCount++;
                result.append(word.toUpperCase()).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        System.out.println("The new text : " + result.toString().trim());
        System.out.println("Overall palindrome word: " + palindromeCount);

        System.out.println("//---------------------------------------------------------------------------");

        String words2 = "          Java is a Powerful and very Cool language           ";
        String cleanWord = words2.toLowerCase().trim();
        String[] stringWord = cleanWord.split(" ");

        StringBuilder result1 = new StringBuilder();
        int LongWordCount = 0;

        for (String word1 : stringWord) {
            if (word1.length() >= 5) {
                LongWordCount++;
                result1.append(word1.toUpperCase()).append(" ");
            } else {
                result1.append(word1).append(" ");
            }
        }
        System.out.println("The result: " + result1);
        System.out.println("The long words: " + LongWordCount);

        System.out.println("//---------------------------------------------------------------------------");

        String words3 = "           Apple and Banana are Always Awesome fruits       ";
        String cleanWord2 = words3.trim().toLowerCase();
        String[] stringWord2 = cleanWord2.split(" ");

        int wordsA = 0;
        StringBuilder result2 = new StringBuilder();

        for (String word2 : stringWord2) {
            if (word2.startsWith("a")) {
                wordsA++;
                result2.append("*").append(word2.toUpperCase()).append("*").append(" ");
            } else {
                result2.append(word2).append(" ");
            }
        }
        System.out.println("The result: " + result2);
        System.out.println("Words with starts 'a' " + wordsA);

        System.out.println("//---------------------------------------------------------------------------");

        String words4 = "        Java Programming is Very Fun and Useful           ";
        String cleanWord3 = words4.trim().toLowerCase();
        String[] rightWord = cleanWord3.split(" ");

        StringBuilder result4 = new StringBuilder();
        int evenWord = 0;

        for (String word4 : rightWord) {
           if (word4.length() % 2 == 0) {
               evenWord++;
               result4.append(new StringBuilder(word4).reverse().toString().toUpperCase()).append(" ");
           } else {
               result4.append("[").append(word4).append("]").append(" ");
           }
        }
        System.out.println("The result is : " + result4);
        System.out.println("Total numbers of even words " + evenWord);

        System.out.println("//---------------------------------------------------------------------------");

        String string = "    Coding in Java is Cool and Classic        ";
        String cleanString = string.toLowerCase().trim();
        String[] stringArray = cleanString.split(" ");

        int cWord = 0;
        StringBuilder result5 = new StringBuilder();

        for (String word5 : stringArray) {
            if (word5.startsWith("c")) {
                cWord++;
                result5.append("[").append(new StringBuilder(word5).reverse().toString().toUpperCase()).append("]").append(" ");
            }else {
                result5.append(word5.toUpperCase()).append(" ");
            }
        }
        System.out.println("The result is: " + result5);
        System.out.println("overall c words " + cWord);






    }
}