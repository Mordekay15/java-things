package p;

public class Engine {
    private String name;
    private int power;
    public Engine(String name, int power){
        this.name = name;
        this.power = power;
    }
    String getName(){
        return name;
    }
    int getPower(){
        return power;
    }
}
