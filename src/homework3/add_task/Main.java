package homework3.add_task;

public class Main {

    public static void main(String[] args) {

        Printer[] printers = new Printer[4];
        printers[0] = new RedPrinter("hello");
        printers[1] = new BluePrinter("hello");
        printers[2] = new YellowPrinter("hello");
        printers[3] = new BlackPrinter("hello");

        for (Printer printer : printers) {
            printer.print("hello");
        }


    }

}
