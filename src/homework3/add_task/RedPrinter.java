package homework3.add_task;

public class RedPrinter extends Printer {

    RedPrinter(String value) {
        super(value);
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    @Override
    public void print(String value) {
        System.out.println(ANSI_RED + value + ANSI_RESET);
    }
}
