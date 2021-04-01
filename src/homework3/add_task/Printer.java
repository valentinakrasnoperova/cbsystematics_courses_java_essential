package homework3.add_task;

public class Printer {
    protected String value;

    Printer(String value) {
        this.value = value;
    }

    public void print(String value) {
        System.out.println(value);
    }

}
