package Exercise1Modul;

import java.util.Scanner;

public class Exercise5 {
    private static final Scanner SCANNER = new Scanner(System.in);

    static void main(String[] args) {
        String userWord = readWord();
        int length = userWord.length();
        String reversed = reverse(userWord);
        int vowels = countVowels(userWord);
        boolean isPalindrome = IsPalindrome(userWord);

        System.out.println("Entered word: " + userWord);
        System.out.println("Length: " + length);
        System.out.println("Reversed: " + reversed);
        System.out.println("Vowels: " + vowels);
        System.out.println("Palindrome: " + isPalindrome);
    }

    private static boolean IsPalindrome(String word) {
        String lowerWord = word.toLowerCase();
        String reversed = reverse(lowerWord);
        return lowerWord.equals(reversed);

    }

    private static int countVowels(String word) {
        String lowerWord = word.toLowerCase();
        int total = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = lowerWord.charAt(i);
            if ("aeiou".indexOf(letter) != -1) {
                total++;
            }
        }
        return total;
    }

    private static String reverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }


    private static String readWord() {
        System.out.print("enter a word: ");
        return SCANNER.nextLine();
    }
}
