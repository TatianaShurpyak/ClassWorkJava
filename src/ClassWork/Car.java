package ClassWork;

/**
 * Created by cladm on 18.04.15.
 */
public class Car {
    public String name;
    public int maxSpeed;
    public String color;
    public String model;

    public void setColor (String color) {
        this.color = color;
    }
    public void Car(String name, int maxSpeed, String color, String model) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.model = model;
    }

    public static void main (String args[]) {
        Car car = new Car();
        car.setColor("green");
    }


}

