package homework3.task3;

public class Plane extends Vehicle {
    int height;
    int numberOfPassangers;

    Plane(int height, int numberOfPassangers, int  price, int  speed, int  year) {
        super(price, speed, year);
        this.height = height;
        this.numberOfPassangers = numberOfPassangers;
    }
}
