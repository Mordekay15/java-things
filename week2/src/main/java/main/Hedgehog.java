package main;

public class Hedgehog {
    private int age;
    private String name;
    public Hedgehog() {
        this.name = "Pikseli";
        this.age = 5;
    }
    public Hedgehog(String name, int age){
        if (age < 0 || name == null || name.isEmpty()) {
            System.out.println("Wrong input value");
            this.name = "Pikseli";
            this.age = 5;
        }
        else{
            this.name = name;
            this.age = age;
        }

    }
    public void speak(String speech){
        if(speech.isEmpty()) {
            System.out.println("I am " + this.name + " and my age is " + this.age +", but could you still give me input values?");
        }
        else {
            System.out.println(this.name + ": " + speech);
        }
    }
    public void run(){
        System.out.println(this.name + " runs really fast!");
    }

}
