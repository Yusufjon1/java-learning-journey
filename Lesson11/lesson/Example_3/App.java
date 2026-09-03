package lesson.Example_3;

public class App {
    public static void main(String[] args) {

        Book book = new Book("123", "Jack Ma", "Jack Ma");
        Book book1 = new Book("123", "Jack Ma", "Jack Ma");
        Book book2 = new Book("124", "Mercedes benz", "Daimler Benz");
//        System.out.println(book.bookDisplay());
//        System.out.println(book2.bookDisplay());
      /*  System.out.println(book == book1); // memory reference will be compared   // xotira manzillari tekshiriladi == belgisi bilan
        System.out.println(book.equals(book1));*/
      //  System.out.println(book.equals(book));
        System.out.println(book2);
    }
}
