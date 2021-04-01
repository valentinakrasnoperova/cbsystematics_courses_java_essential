package homework3.add_task;

public class ColoredPrinter extends Printer {

    public ColoredPrinter(String value) {
        super(value);
    }

    @Override
    public void print(String value){
        System.out.println((char)27 + "[35m" + value);
    }
}
