package homework8.add_task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String operation;
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        String choiceContinue;
        double firstOperand;
        double secondOperand;

        do {
            System.out.println("Enter the first number : ");
            firstOperand = Double.parseDouble(input.next());
            System.out.println("Enter the second number : ");
            secondOperand = Double.parseDouble(input.next());
            System.out.println("Enter the operation : ");
            operation = input.next();

            switch (operation) {
                case "+":
                    System.out.println("Sum: " + Calculator.sum(firstOperand, secondOperand));
                    break;
                case "-":
                    System.out.println("Difference: " + Calculator.difference(firstOperand, secondOperand));
                    break;
                case "*":
                    System.out.println("Multiplication : " + Calculator.multiplication(firstOperand, secondOperand));
                    break;
                case "/":
                    try {
                        System.out.println("Division : " + Calculator.division(firstOperand, secondOperand));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("You have chosen a wrong operation");

            }
            System.out.println("Do you want to continue? y/n ");
            choiceContinue = in.nextLine();

        } while (!choiceContinue.equalsIgnoreCase("n"));
    }

}
