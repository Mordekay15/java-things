package p;

public class Main {
    public static void main(String[] args) {
    System.out.println("Initial bookshelf contents:");
    Author author = new Author("George Orwell", "-");
    Book b1 = new Book("1984", "978-0451524935", author);
    Book b2 = new Book("Animal Farm", "978-0451526342", author);

    Bookshelf bookshelf = new Bookshelf();
    bookshelf.addBook(b1);
    bookshelf.addBook(b2);

    bookshelf.displayBooks();

    bookshelf.removeBook(b1);
    System.out.println("Updated bookshelf contents:");
    bookshelf.displayBooks();

    }
}