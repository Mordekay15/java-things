package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LibrarySystem {
    private List<Item> items = new ArrayList<>();
    private FileHandler fileHandler = new TextFileHandler();
    LibrarySystem(){}
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(String id){
        for (Item item : items){
            if (Objects.equals(item.getId(), id)){
                items.remove(item);
                return;
            }
        }
    }
    public void listAllItems(){
        for (Item item : items){
            if (item instanceof Book book) {
                System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            } else if (item instanceof DVD dvd) {
                System.out.println("ID: " + dvd.getId() + ", Title: " + dvd.getTitle() + ", Duration: " + dvd.getDuration() + " minutes");
            }
        }
    }
    public void searchByTitle(String str){
        boolean found = false;
        for (Item item : items){
            String lower_title = item.getTitle().toLowerCase();
            if(lower_title.contains(str)){
                found = true;
                if (item instanceof Book book) {
                    System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
                } else if (item instanceof DVD dvd) {
                    System.out.println("ID: " + dvd.getId() + ", Title: " + dvd.getTitle() + ", Duration: " + dvd.getDuration() + " minutes");
                }
            }
        }
        if(!found){
            System.out.println("No items found with that title.");
        }
    }
    public void saveToFile(String filename) throws IOException {
        fileHandler.saveItems(filename, items);
    }
    public void loadFromFile(String filename) throws IOException {
        items = fileHandler.loadItems(filename);
    }
    public void displayMenu(){
        System.out.println("=== Library Management System ===\n" +
                "1. Add new Book\n" +
                "2. Add new DVD\n" +
                "3. Remove item\n" +
                "4. List all items\n" +
                "5. Search by title\n" +
                "6. Save to file\n" +
                "7. Load from file\n" +
                "8. Exit");
    }
}
