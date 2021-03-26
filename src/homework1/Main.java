package homework1;

import homework1.task2.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rec = new Rectangle();

        System.out.print("Enter the first side = ");
        double side1 = input.nextDouble();
        System.out.print("Enter the second side = ");
        double side2 = input.nextDouble();

        rec.perimeterCalculator(side1, side2);
        rec.areaCalculator(side1, side2);
        rec.showTheResult();

    }
}
