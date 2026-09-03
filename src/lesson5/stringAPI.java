package lesson5;

public class stringAPI {
    public static void main(String[] args) {
        String name = "java";
        String upperName = name.toUpperCase();
        System.out.println(upperName);

        String name2 = "PYTHON";
        String lowerName = name2.toLowerCase();
        System.out.println(lowerName);

        String sizes = String.join("/", "S", "M", "L", "XL");
        System.out.println(sizes);

        String word = "Java";
        String repeatedStr = word.repeat(10);
        System.out.println(repeatedStr);
    }
}
