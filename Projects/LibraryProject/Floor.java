package Projects.LibraryProject;

public class Floor {

    private Closet[] closets = new Closet[30];

    public Floor() {
        for (int i = 0; i < 30; i++) {
            this.closets[i] = new Closet("C" + (i + 1));
        }
    }

    public boolean add(Book book, String closet, int shelf) {
        Closet c = this.getCloset(closet);
        if (c != null) {
            return c.add(book, shelf);
        }
        return false;
    }

    public boolean contains(String closet, int shelf, Book book) {
        Closet c = this.getCloset(closet);
        if (c != null) {
            return c.contains(shelf, book);
        }
        return false;
    }

    private Closet getCloset(String name) {
        for (Closet a : this.closets) {
            if (name.equals(a.getName())) {
                return a;
            } /*else {
                System.out.println("Closet could not find");*/

        }
        return null;
    }


    public String getBooks(String closet) {
        Closet c = this.getCloset(closet);

        if (c != null) {
            return c.getBooks();
        }
        return null;
    }
}
