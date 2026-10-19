package Lesson17.hw1;

public class Main {
    static void main(String[] args) {
        System.out.println("New created object");
        Book book = new Book("Der Vorleser", "Bernhard Schlink", 250, 45000);

        System.out.println("Name " + book.name());
        System.out.println("Author " + book.author());
        System.out.println("Page " + book.pageCount());
        System.out.println("Price " + book.price());

        System.out.println("Compact constructor control");

        try {
            Book invalidBook1 = new Book("", "Sherlock Holmes", 150, 25000);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Book invalidBook2 = new Book("Romeo and Julietta", null, 450, 2500);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Book invalidBook3 = new Book("mrom sila", "azam dotachi", -2000, 45000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
