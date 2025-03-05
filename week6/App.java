package p;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        while (true) {
            System.out.println("1) Create new vehicle, 2) List vehicles 3) Drive cars, 4) Fly planes, 5) Sail " +
                    "the ships, 0) End the program");

            Engine car_engine = new Engine("V8", 300);
            Engine plane_engine = new Engine("Jet engine", 500);
            Engine ship_engine = new Engine("Wärtsilä Super", 1000);

            int choice = scanner.nextInt();
            switch (choice) {
                case 0 -> {
                    System.out.println("Thank you for using the program.");
                    return;
                }
                case 1 -> {
                    System.out.println("Which vehicle do you want to build? 1) car, 2) plane, 3) ship");
                    int v = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Who is the manufacturer?");
                    String manufacture = scanner.nextLine();
                    System.out.println("What is the model of the vehicle?");
                    String model = scanner.nextLine();
                    System.out.println("What is the top speed?");
                    int speed = scanner.nextInt();

                    switch (v){
                        case 1 -> {
                            Car car = new Car(manufacture, model, speed);
                            car.engine = car_engine;
                            vehicles.add(car);
                        }
                        case 3 -> {
                            Ship ship = new Ship(manufacture, model, speed);
                            ship.engine = ship_engine;
                            vehicles.add(ship);
                        }
                        case 2 -> {
                            Plane plane = new Plane(manufacture, model, speed);
                            plane.engine = plane_engine;
                            vehicles.add(plane);
                        }
                    }
                }
                case 2 -> {
                    for(Vehicle vehicle : vehicles){
                        System.out.println(vehicle.type + ": "+ vehicle.manufacturer + " " + vehicle.model);
                        System.out.println("Max Speed: " + vehicle.maxSpeed + " km/h");
                        System.out.println("Engine: " + vehicle.engine.getName() + " (" + vehicle.engine.getPower()+" HP) \n");
                    }

                }
                case 3 -> {
                    for (Vehicle v: vehicles){
                        if (Objects.equals(v.type, "Car")){
                            ((Car) v).drive((Car) v);
                        }
                    }
                }
                case 4 -> {
                    for (Vehicle v: vehicles){
                        if (Objects.equals(v.type, "Plane")){
                            ((Plane) v).fly((Plane) v);
                        }
                    }
                }
                case 5 -> {
                    for (Vehicle v: vehicles){
                        if (Objects.equals(v.type, "Ship")){
                            ((Ship) v).sail((Ship) v);
                        }
                    }
                }
            }
        }
    }
}