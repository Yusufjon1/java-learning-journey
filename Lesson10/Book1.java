package Lesson10;

public class Book1 {
    public String name;
    public String author;
    public int page;

    public Book1 (String name, String author, int page) {
        this.name = name;
        this.author = author;
        this.page = page;
    }

    public void displayKitob() {
        System.out.printf("Name of the Book : %s%nName of the Author : %s%nPage of the Book : %d", name, author, page);
    }
}
