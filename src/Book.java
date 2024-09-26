public class Book {

    private String name;
    private String Author;
    private int date;

    public Book(String name, String Author, int date) {
        this.name = name;
        this.Author = Author;
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.Author;
    }

    public int getDatee() {
        return this.date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
