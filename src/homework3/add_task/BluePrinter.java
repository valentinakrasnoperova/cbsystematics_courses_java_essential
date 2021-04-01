package homework3.add_task;

public class BluePrinter extends Printer {
    BluePrinter(String value) {
        super(value);
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";


    @Override
    public void print(String value) {
        System.out.println(ANSI_BLUE + value + ANSI_RESET);
    }
}
