package homework2.add_task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int radius = input.nextInt();

        System.out.println(MyArea.areaOfCircle(radius));


    }
}
