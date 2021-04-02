package homework4.task2;

public class TXTHandler extends AbstractHandler {
    public void open() {
        System.out.println("TXT document was opened ");
    }

    public void create() {
        System.out.println("TXT document was created ");

    }

    public void change() {
        System.out.println("TXT document was changed ");

    }

    public void save() {
        System.out.println("TXT document was saved ");
        System.out.print("\n");


    }
}
