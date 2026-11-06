package Projects.LibraryProject;

public class Shelf {
    private Book[] books = new Book[10];
    private int number;
    private int currentIndex = 0;

    public Shelf(int number) {
        this.number = number;
    }

    public boolean add(Book book) {
        if (currentIndex < 10) {
            this.books[this.currentIndex] = book;
            this.currentIndex++;
            return true;
        }
        return false;
    }

    public boolean contains(Book book) {
        for (int i = 0; i < books.length; i++) {
            Book b = this.books[i];
            if (b != null) {
               return book.getAuthor().equals(b.getAuthor()) && book.getTitle().equals(b.getTitle());
            }
        }
        return false;
    }

    public String getBooks() {
        String result = "";
        for (int i = 0; i < books.length; i++) {
            Book b = this.books[i];
            if (b != null) {
                result += toString() + "\n";
            }
        }
        return result;
    }
}
