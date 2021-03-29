package  homework2.task4;

import homework2.task4.Car;

public class Main {
    public static void main(String[] args) {
        Car carDefault1 = new Car();
        Car carWithOnePyearmeter = new Car(2015);
        Car carWithTwoPyearmeters = new Car(1995, 300);
        Car carWithThreePyearmeters = new Car(2003, 180, 4000);
        Car carWithFourPyearmeters = new Car(1997, 200, 1500, "Red");

        System.out.println("year : "+ carDefault1.year + ", speed : " + carDefault1.speed + ", weight : " + carDefault1.weight + ", colour : " + carDefault1.colour);
         System.out.println("year : "+ carWithOnePyearmeter.year + ", speed : " + carWithOnePyearmeter.speed + ", weight : " + carWithOnePyearmeter.weight + ", colour : " + carWithOnePyearmeter.colour);
        System.out.println("year : "+ carWithTwoPyearmeters.year + ", speed : " + carWithTwoPyearmeters.speed + ", weight : " + carWithTwoPyearmeters.weight + ", colour : " + carWithTwoPyearmeters.colour);
        System.out.println("year : "+ carWithThreePyearmeters.year + ", speed : " + carWithThreePyearmeters.speed + ", weight : " + carWithThreePyearmeters.weight + ", colour : " + carWithThreePyearmeters.colour);
        System.out.println("year : "+ carWithFourPyearmeters.year + ", speed : " + carWithFourPyearmeters.speed + ", weight : " + carWithFourPyearmeters.weight + ", colour : " + carWithFourPyearmeters.colour);


    }
}
