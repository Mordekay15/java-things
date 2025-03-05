package p;

import java.util.ArrayList;

public class Bookshelf {
    ArrayList<Book> books = new ArrayList<>();
    Bookshelf(){}
    void addBook(Book book){
        books.add(book);
    }
    boolean removeBook(Book book){
        System.out.println("\nRemoving " + book.getTitle() + "...\n");
        return books.remove(book);
    }
    void displayBooks(){
        System.out.println("Books on the shelf:");
        for(Book b : books){
            System.out.println("Title: " + b.getTitle() + ", Author: " + b.getAuthor().getName() + ", ISBN: "+ b.getIsbn());
        }

    }
}
