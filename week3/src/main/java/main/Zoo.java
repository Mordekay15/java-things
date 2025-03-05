package main;
import java.util.ArrayList;


public class Zoo {
    String zoo_name;
    ArrayList<Animal> animals = new ArrayList<>();

    Zoo(String name){
        zoo_name = name;
    }

    void addAnimals(String name, String species, int age){
        Animal animal = new Animal(species, name, age);
        animals.add(animal);

    }
    void listAnimals(){
        System.out.println(zoo_name + " contains the following animals:");
        for (Animal a : animals) {
            System.out.println(a.getSpecies() + ": " + a.getName() + ", " + a.getAge() + " years");
        }
    }
    void animalsRun(int laps) {
        for (Animal a : animals) {
            for(int i = 0; i < laps; i++){
                a.run();
            }
        }
    }

}
