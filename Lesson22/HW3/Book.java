package Lesson22.HW3;

public class Book {
    private final int id;
    private final String title;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{id=" + id + ", title=" + title + "}";
    }
}
