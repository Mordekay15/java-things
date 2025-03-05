package p;

public class Book {
    private String title;
    private String isbn;
    private Author author;
    Book(String title, String isbn, Author author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }
    String getTitle(){
        return this.title;
    }
    String getIsbn(){
        return this.isbn;
    }
    Author getAuthor(){
        return this.author;
    }
}
