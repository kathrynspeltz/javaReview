public class Book {
    private String title;
    private String author;

    private Integer bookPages;

    Book(String title, String author, Integer bookPages ) {
        this.title = title;
        this.author = author;
        this.bookPages = bookPages;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
    public String toString() {
        return String.format("%s by %s", this.title, this.author);
    }

}
