package homework1.task2;

import java.util.Scanner;

public class Rectangle {
    public double square, perimeter;


    public Rectangle() {
    }

    public double areaCalculator(double side1, double side2) {
        square = (side1 * side2);
        return square;
    }

    public double perimeterCalculator(double side1, double side2) {
        perimeter = 2 * (side1 + side2);
        return perimeter;
    }

    public void showTheResult() {
        System.out.print("The square is " + square);
        System.out.print("\n");
        System.out.print("The perimeter is " + perimeter);
    }


}
