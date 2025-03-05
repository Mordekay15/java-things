package p;

public abstract class Item {
    private String id;
    private String title;
    Item(String id, String title){
        this.id = id;
        this.title = title;
    }
    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
}
