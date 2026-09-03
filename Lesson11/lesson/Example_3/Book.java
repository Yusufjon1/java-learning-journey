package lesson.Example_3;

public class Book /*extends Object*/ {

    private String id;
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null)
            return false;

        if (this == obj)
            return true;

        if (!(obj instanceof Book o))
            return false;

        return  this.title.equals(o.getTitle()) &&
                this.id.equals(o.getId()) &&
                this.author.equals(o.getAuthor());
    }

    @Override
    public String toString() {
        return "Book {ID = %s, TITLE = %s, AUTHOR = %s}"
                .formatted(id, title, author);
    }

    public String bookDisplay() {
        return "Book {ID = %s, TITLE = %s, AUTHOR = %s}"
                .formatted(id, title, author);
    }
}
