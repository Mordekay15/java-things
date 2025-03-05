package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        LibrarySystem lib = new LibrarySystem();
        while (true){
            lib.displayMenu();
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 ->{
                    scanner.nextLine();
                    System.out.println("Enter book ID:");
                    String book_id = scanner.nextLine();
                    System.out.println("Enter title:");
                    String book_title = scanner.nextLine();
                    System.out.println("Enter author:");
                    String book_author = scanner.nextLine();
                    Book book = new Book(book_id, book_title);
                    book.setAuthor(book_author);
                    lib.addItem(book);
                    System.out.println("Book added successfully.\n");
                }
                case 2 ->{
                    scanner.nextLine();
                    System.out.println("Enter DVD ID:");
                    String DVD_id = scanner.nextLine();
                    System.out.println("Enter title:");
                    String DVD_title = scanner.nextLine();
                    System.out.println("Enter duration (minutes):");
                    int DVD_duration = scanner.nextInt();
                    DVD dvd = new DVD(DVD_id, DVD_title);
                    dvd.setDuration(DVD_duration);
                    lib.addItem(dvd);
                    System.out.println("DVD added successfully.\n");
                }
                case 3 ->{
                    scanner.nextLine();
                    System.out.println("Enter item ID to remove:");
                    String id = scanner.nextLine();
                    lib.removeItem(id);
                    System.out.println("Item removed successfully.\n");
                }
                case 4 ->{
                    lib.listAllItems();
                    System.out.println("");
                }
                case 5 ->{
                    scanner.nextLine();
                    System.out.println("Enter title to search for:");
                    String srt = scanner.nextLine();
                    lib.searchByTitle(srt.toLowerCase(Locale.ROOT));
                    System.out.println("");
                }
                case 6 ->{
                    scanner.nextLine();
                    System.out.println("Enter filename to save:");
                    String filename = scanner.nextLine();
                    lib.saveToFile(filename);
                    System.out.println("Items saved to file successfully.\n");
                }
                case 7 ->{
                    scanner.nextLine();
                    System.out.println("Enter filename to load:");
                    String filename = scanner.nextLine();
                    lib.loadFromFile(filename);
                    System.out.println("Items loaded from file successfully.\n");
                }
                case 8 ->{
                    System.out.println("Goodbye!");
                    return;
                }
                default -> {
                    System.out.println("Invalid choice. Please try again.\n");
                }
            }

        }


    }
}