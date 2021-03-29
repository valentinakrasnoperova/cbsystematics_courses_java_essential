package homework2.task3;

public class Car {
    int age;
    double speed;
    int weight;
    String colour;

    public Car() {
        this.age = 1999;
        this.speed = 150;
        this.weight = 3000;
        this.colour = "Black";
    }

    public Car(int age) {
        this.age = age;
        this.speed = 150;
        this.weight = 3000;
        this.colour = "Black";
    }

    public Car(int age, double speed) {
        this.age = age;
        this.speed = speed;
        this.weight = 3000;
        this.colour = "Black";
    }

    public Car(int age, double speed, int weight) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.colour = "Black";
    }

    public Car(int age, double speed, int weight, String colour) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }


}
