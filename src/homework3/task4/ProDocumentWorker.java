package homework3.task4;

public class ProDocumentWorker extends DocumentWorker {

    @Override
    public void editDocument() {
        System.out.println("Document was edited");

    };

    @Override
    public void saveDocument() {
        System.out.println("Document was saved as in previous version, saving in new version is available only in Expert version ");
    };
}
