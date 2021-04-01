package homework3.task3;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(200, 300, 350000000, 400, 1999);
        Ship ship = new Ship("VIS", 200, 400000, 290, 2002);
        Саг car = new Саг(15000, 200, 2005);

        System.out.println(plane.height + ", " + plane.numberOfPassangers + ", " + plane.getPrice() + ", " + plane.getSpeed() + ", " + plane.getYear());
        System.out.println(ship.homePort + ", " + ship.amountofPassangers + ", " + ship.getPrice() + ", " + ship.getSpeed() + ", " + ship.getYear());
        System.out.println(car.getPrice() + ", " + car.getSpeed() + ", " + car.getYear());


    }
}
