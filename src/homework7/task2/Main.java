package homework7.task2;

public class Main {
    public static void main(String[] args) {
        ErrorPrinter errorPrinter = new ErrorPrinter() {
            public static final String ANSI_RESET = "\u001B[0m";
            public static final String ANSI_RED = "\u001B[31m";

            @Override
            public void printError(String error) {
                System.out.println(ANSI_RED + error + ANSI_RESET);
            }
        };
        errorPrinter.printError("error 404");
    }
}
