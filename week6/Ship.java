package p;

public class Ship extends Vehicle {
    public Ship(String manufacturer, String model, int maxSpeed){
        super("Ship", manufacturer, model, maxSpeed);
    }
    void sail(Ship ship){
        System.out.println(ship.manufacturer + " " + ship.model + " is sailing on the sea!");
    }
}
