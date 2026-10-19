package Lesson17.hw1;

public record Book(String name, String author, int pageCount, double price) {
    public Book {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name can not be empty");
        }
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author can not be empty");
        }
        if (pageCount == 0 || pageCount < 0) {
            throw new IllegalArgumentException("Page can not be zero or negative");
        }
    }
}
