package homework4.task2;

public class DOCHandler extends AbstractHandler {
    public void open() {
        System.out.println("DOC document was opened ");
    }

    public void create() {
        System.out.println("DOC document was created ");

    }

    public void change() {
        System.out.println("DOC document was changed ");

    }

    public void save() {
        System.out.println("DOC document was saved ");
        System.out.print("\n");

    }

}
