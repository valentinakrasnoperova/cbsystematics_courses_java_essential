package homework2.task2;

public class Car {
    private String colour;
    private int year;

    public Car() {
        this.year=2005;
        this.colour="Red";
    }

    public Car(int year) {
        this.year = year;
        this.colour="White";
    }

    public Car(int year, String colour) {
        this.year = year;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
