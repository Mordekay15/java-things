package p;

public class Car extends Vehicle {
    public Car(String manufacturer, String model, int maxSpeed){
        super("Car", manufacturer, model, maxSpeed);
    }
    void drive(Car car){
        System.out.println(car.manufacturer + " " + car.model + " is driving on the road!");
    }
}
