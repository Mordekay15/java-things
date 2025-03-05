package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, name the zoo:");
        String input_name = scanner.nextLine();
        Zoo zoo = new Zoo(input_name);

        while (true) {
            System.out.println("1) Create a new animal, 2) List all animals, 3) Run animals, 0) End the program");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0 -> {
                    System.out.println("Thank you for using the program.");
                    return;
                }
                case 1 -> {
                    scanner.nextLine();
                    System.out.println("What species?");
                    String new_s = scanner.nextLine();
                    System.out.println("Enter the name of the animal:");
                    String new_name = scanner.nextLine();
                    System.out.println("Enter the age of the animal:");
                    int new_age = scanner.nextInt();

                    scanner.nextLine();
                    zoo.addAnimals(new_name, new_s, new_age);
                }
                case 2 -> {
                    zoo.listAnimals();
                }
                case 3 -> {
                    System.out.println("How many laps?");
                    int laps = scanner.nextInt();
                    if(laps < 0) {
                        System.out.println("Wrong input value");
                    }
                    else {
                        zoo.animalsRun(laps);
                    }
                }
                default -> System.out.println("Wrong input value");

            }
        }
    }
}
