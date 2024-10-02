import java.util.Objects;

public class Book {

    private String name;
    private Author author;
    private int date;

    public Book(String name, Author author, int date) {
        this.name = name;
        this.author = author;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
