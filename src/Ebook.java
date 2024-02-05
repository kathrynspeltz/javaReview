public class Ebook extends  Book{
    private String format;

    Ebook(String title, String author, int bookPages, String format){
        super(title, author, bookPages);
        this.format = format;

    }
}
