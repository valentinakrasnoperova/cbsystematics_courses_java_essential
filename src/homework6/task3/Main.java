package homework6.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String choiceContinue;
        Scanner input;
        input = new Scanner(System.in);
        double distance2;
        Distance distance1;
        distance1 = new Distance();
        do {
            System.out.println(" What distance you want to convert ?");
            distance2 = Double.parseDouble(input.nextLine());
            distance1.distance = distance2;
            distance1.print();
            System.out.println("Do you want to continue? y/n ");
            choiceContinue = input.nextLine();
        } while (!choiceContinue.equalsIgnoreCase("n"));
    }
}
