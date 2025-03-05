package p;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TextFileHandler implements FileHandler{
    TextFileHandler(){}
    @Override
    public void saveItems(String filename, List<Item> items) throws IOException {
        FileWriter fw = new FileWriter(filename);
        for (Item item : items) {
            if(item.getClass() == Book.class) {
                fw.write("BOOK;" + item.getId() + ";" + item.getTitle()+ ";" + ((Book) item).getAuthor()+"\n");
            }
            else if (item.getClass() == DVD.class){
                fw.write("DVD;" + item.getId() + ";" + item.getTitle()+ ";" + ((DVD) item).getDuration()+"\n");
            }
        }
        fw.close();
    }
    @Override
    public List<Item> loadItems(String filename) {
        List<Item> items = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");

                if(Objects.equals(parts[0], "BOOK")){
                    Book book = new Book(parts[1], parts[2]);
                    book.setAuthor(parts[3]);
                    items.add(book);
                }
                else if (Objects.equals(parts[0], "DVD")){
                    DVD dvd = new DVD(parts[1], parts[2]);
                    dvd.setDuration(Integer.parseInt(parts[3]));
                    items.add(dvd);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return items;
    }
}
