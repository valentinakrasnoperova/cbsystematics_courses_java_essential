package  homework2.task4;

public class Car {
     int year;
     double speed;
     int weight;
     String colour;

    public Car() {
        this(1995, 200, 3000, "Red");
    }

    public Car(int year){
        this(year, 250, 3500, "Blue");
    }

    public Car(int year, double speed){
        this(year, speed, 3700, "Red");
    }

    public Car(int year, double speed, int weight){
        this(year, speed, weight, "Red");
    }



    public Car(int i, double i1, int i2, String red) {
        this.year = i;
        this.speed = i1;
        this.weight = i2;
        this.colour = red;
    }

}
