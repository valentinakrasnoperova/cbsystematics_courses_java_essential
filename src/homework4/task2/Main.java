package homework4.task2;

public class Main {
    public static void main(String[] args) {

        AbstractHandler docDoc = new DOCHandler();
        AbstractHandler txtDoc = new TXTHandler();
        AbstractHandler xmlDoc = new XMLHandler();

        docDoc.open();
        docDoc.create();
        docDoc.change();
        docDoc.save();
        txtDoc.open();
        txtDoc.create();
        txtDoc.change();
        txtDoc.save();
        xmlDoc.open();
        xmlDoc.create();
        xmlDoc.change();
        xmlDoc.save();

    }
}
