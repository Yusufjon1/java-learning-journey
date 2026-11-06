package Projects.LibraryProject;

public class Closet {

    private Shelf[] shelves = new Shelf[6];
    private String name;

    public String getName() {
        return name;
    }

    public Closet(String name) {
        this.name = name;
        for (int i = 0; i < 6; i++) {
            this.shelves[i] = new Shelf(i);
        }
    }

    public boolean add(Book book, int shelf) {
        Shelf s = this.shelves[shelf - 1];
        return s.add(book);
    }

    public boolean contains(int shelf, Book book) {
        Shelf s = this.shelves[shelf - 1];
       return s.contains(book);
    }

    public String getBooks() {
        String result = "";
        for (int i = 0; i < shelves.length; i++) {
            Shelf shelf = this.shelves[i];
            result += "Shelf " + (i + 1) + "\n";
            result += shelf.getBooks();
        }
        return result;
    }
}
