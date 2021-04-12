package homework8.add_task;

public class Calculator {
    static double sum(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    static double difference(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    static double multiplication(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    static double division(double firstOperand, double secondOperand) {

        if (secondOperand != 0) {
            return firstOperand / secondOperand;
        } else {

            throw new ArithmeticException("Деление на ноль невозможно");
        }

    }
}
