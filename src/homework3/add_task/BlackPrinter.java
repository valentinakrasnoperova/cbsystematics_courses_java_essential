package homework3.add_task;

public class BlackPrinter extends Printer {
    BlackPrinter(String value) {
        super(value);
    }

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Override
    public void print(String value) {
        System.out.println(ANSI_BLACK + value + ANSI_RESET);
    }
}
