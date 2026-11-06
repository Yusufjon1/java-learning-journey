package Projects.LibraryProject;

public class Main {
    static void main(String[] args) {


        Library library = new Library();

        Book book = new Book("author 1", "title 1");
        library.add(book, 1, "C1", 1);
        String s = library.getBooks(1, "C1");
        System.out.println(s);

        System.out.println("addBookTest() -> LibraryAddBook() -> " + addBookTest());


    }

    private static boolean addBookTest() {
        Book book1 = new Book("author 1", "title 1");
        Book book2 = new Book("author 2", "title 2");

        Library library = new Library();

        boolean test1 = library.add(book1, 1, "C1", 1);
        if (!test1) {
            System.out.println("addBookTest book1 error!");
            return false;
        }

        boolean test2 = library.add(book2, 1, "C2", 1);
        if (!test2) {
            System.out.println("addBookTest book2 error");
            return false;
        }
        return true;
    }
}
