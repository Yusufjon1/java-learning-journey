package Lesson10;

public class Book {
    public String title; // field
    public int pageCount; // field
    public int id; // field

    // parametrized constructor
    public Book(String title, int pageCount) {
        System.out.println("2 argument constructor");
        this.title = title;
        this.pageCount = pageCount;
    }

    public void displayBook() {
        System.out.printf("Book id : %d%nBook name : %s%nBook page Count : %d%n", id, title, pageCount);
    }

    public Book (int id, String title, int pageCount) {
        this(title, pageCount);
        this.id = id;
        System.out.println("3 argument constructor");
    }

    // copy constructor
    public Book(Book book) {
        this.title = "new -> " + book.title;
        this.pageCount = 1000 + book.pageCount;
    }
}
