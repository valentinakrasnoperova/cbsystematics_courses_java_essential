package homework4.task2;

public class XMLHandler extends AbstractHandler {
    public void open() {
        System.out.println("XML document was opened ");
    }

    public void create() {
        System.out.println("XML document was created ");

    }

    public void change() {
        System.out.println("XML document was changed ");

    }

    public void save() {
        System.out.println("XML document was saved ");
        System.out.print("\n");


    }
}
