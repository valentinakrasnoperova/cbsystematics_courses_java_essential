package homework6.task2;

public class Vehicle {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private class Wheel {
        String wheelColor = "Purple wheel";
    }

    private class Door {
        String doorColor = "White door";
    }

    Wheel wheel = new Wheel();
    Door door = new Door();

    public void printWheelColor() {
        System.out.println(ANSI_PURPLE + wheel.wheelColor + ANSI_RESET);
    }

    public void printDoorColor() {
        System.out.println(ANSI_WHITE + door.doorColor + ANSI_RESET);

    }
}
