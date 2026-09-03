package lesson5;

public class stringBlock {
    public static void main(String[] args) {
        String block = """ 
        Hello world. I am testing now text block !   
        I hope you guys are having fun \
        😄😄😄
        """;
        System.out.println("--------------");
        System.out.println(block);
        System.out.println("---------------"); // \ -> used to add lines together
    }
}
