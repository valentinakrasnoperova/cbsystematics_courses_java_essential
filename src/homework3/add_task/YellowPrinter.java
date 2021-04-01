package homework3.add_task;

public class YellowPrinter extends Printer {
    YellowPrinter(String value) {
        super(value);
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    @Override
    public void print(String value) {
        System.out.println(ANSI_YELLOW + value + ANSI_RESET);
    }
}
