package homework2.task2;

public class Main {
    public static void main(String[] args) {


        Car car = new Car();
        Car car1 = new Car(1995);
        Car car2 = new Car(1985, "Red");

        System.out.println("Age : " + car.getYear() + ", Colour : " + car.getColour());
        System.out.println("Age : " + car1.getYear() + ", Colour : " + car1.getColour());
        System.out.println("Age : " + car2.getYear() + ", Colour : " + car2.getColour());


    }
}
