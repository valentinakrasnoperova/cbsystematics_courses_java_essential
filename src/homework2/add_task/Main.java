package homework2.add_task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int radius = input.nextInt();

        MyArea area = new MyArea();
        System.out.println(MyArea.areaOfCircle(radius));


    }
}
