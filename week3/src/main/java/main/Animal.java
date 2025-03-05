package main;

public class Animal {
    private String species;
    private String name;
    private int age;
    Animal(String s, String n, int a){
        species = s;
        name = n;
        age = a;
    }

    String getName(){
        return this.name;
    }
    String getSpecies(){
        return this.species;
    }
    int getAge(){
        return this.age;
    }
    void run(){
        System.out.println(this.name + " runs really fast!");
    }
}
