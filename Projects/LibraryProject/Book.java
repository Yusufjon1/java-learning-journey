package Projects.LibraryProject;

public class Book {
    private final String author;
    private final String title;

    public Book (String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.author + ", " + this.title;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        if (this.author.equals(book.author) && this.title.equals(book.title)) {
            return true;
        }
        return false;
    }
}
