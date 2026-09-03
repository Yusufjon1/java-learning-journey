package lesson7;

public class compactString {
    public static void main(String[] args) {

        int a = 12; // 4 byte -> 32 bit;
        String str = "hi";

        // java 8 UTF-16; 16 bit
        // java 9 Latin-1; byte[];

        String str2 = "hello"; // byte[].length = 5 byte, if there is only latin vowels, and each vowel has 1 byte memory
        String str3 = "hello%"; // byte[].length = 12 byte, for non latin vowels, and each vowel has 2 byte memory because of non latin vowels

    }
}
