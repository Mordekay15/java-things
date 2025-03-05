package p;

import java.io.IOException;
import java.util.List;

public interface FileHandler {
    void saveItems(String filename, List<Item> items) throws IOException;
    List<Item> loadItems(String filename) throws IOException;
}
