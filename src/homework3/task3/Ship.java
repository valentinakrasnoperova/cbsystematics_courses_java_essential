package homework3.task3;

public class Ship extends Vehicle {
    String homePort;
    int amountofPassangers;

    Ship(String homePort, int amountofPassangers, int  price, int  speed, int  year) {
        super(price, speed, year);
        this.homePort = homePort;
        this.amountofPassangers = amountofPassangers;
    }
}
