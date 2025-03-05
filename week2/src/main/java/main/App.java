package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hedgehog h = new Hedgehog();
        while (true) {
            System.out.println("1) Make hedgehog talk, 2) Create new hedgehog, 3) Make hedgehog run, 0) Quit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0 -> {
                    System.out.println("Thank you for using the program.");
                    return;
                }
                case 1 -> {
                    System.out.println("What does hedgehog say?");
                    scanner.nextLine();
                    String h_say = scanner.nextLine();
                    h.speak(h_say);
                }
                case 2 -> {
                    scanner.nextLine();
                    System.out.println("What is the name of the hedgehog:");
                    String new_name = scanner.nextLine();
                    System.out.println("What is the age of the hedgehog:");
                    int new_age = scanner.nextInt();

                    scanner.nextLine();

                    h = new Hedgehog(new_name, new_age);
                }
                case 3 -> {
                    System.out.println("How many laps?");
                    int laps = scanner.nextInt();
                    if(laps < 0) {
                        System.out.println("Wrong input value");
                    }
                    else {
                        while(laps != 0){
                            h.run();
                            laps--;
                        }
                    }
                }
                default -> System.out.println("Wrong input value");

            }
        }
    }
}
