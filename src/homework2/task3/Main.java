package homework2.task3;

public class Main {
    public static void main(String[] args) {
        Car carDefault = new Car();
        Car carWithOneParemeter = new Car(2015);
        Car carWithTwoParemeters = new Car(1995, 300);
        Car carWithThreeParemeters = new Car(2003, 180, 4000);
        Car carWithFourParemeters = new Car(1997, 200, 1500, "Red");

        System.out.println("Age : "+ carDefault.age + ", speed : " + carDefault.speed + ", weight : " + carDefault.weight + ", colour : " + carDefault.colour);
        System.out.println("Age : "+ carWithOneParemeter.age + ", speed : " + carWithOneParemeter.speed + ", weight : " + carWithOneParemeter.weight + ", colour : " + carWithOneParemeter.colour);
        System.out.println("Age : "+ carWithTwoParemeters.age + ", speed : " + carWithTwoParemeters.speed + ", weight : " + carWithTwoParemeters.weight + ", colour : " + carWithTwoParemeters.colour);
        System.out.println("Age : "+ carWithThreeParemeters.age + ", speed : " + carWithThreeParemeters.speed + ", weight : " + carWithThreeParemeters.weight + ", colour : " + carWithThreeParemeters.colour);
        System.out.println("Age : "+ carWithFourParemeters.age + ", speed : " + carWithFourParemeters.speed + ", weight : " + carWithFourParemeters.weight + ", colour : " + carWithFourParemeters.colour);

    }



}
