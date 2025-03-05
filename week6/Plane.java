package p;

public class Plane extends Vehicle {
    public Plane(String manufacturer, String model, int maxSpeed){
        super("Plane", manufacturer, model, maxSpeed);
    }
    void fly(Plane plane){
        System.out.println(plane.manufacturer + " " + plane.model + " is flying in the sky!");
    }
}
