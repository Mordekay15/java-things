package p;

public class DVD extends Item{
    private int duration;
    DVD(String id, String title){
        super(id, title);
    }
    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
}
