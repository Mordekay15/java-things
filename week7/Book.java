package p;

public class Book extends Item{
    private String author;
    Book(String id, String title){
        super(id, title);
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
}
