package homework3.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the key : ");
        String key = input.next();

        switch (key) {
            case "pprdoc": {
                ProDocumentWorker prodoc = new ProDocumentWorker();
                prodoc.openDocument();
                prodoc.editDocument();
                prodoc.saveDocument();
                break;
            }

            case "exxpdoc": {
                ExpertDocumentWorker expdoc = new ExpertDocumentWorker();
                expdoc.openDocument();
                expdoc.editDocument();
                expdoc.saveDocument();
                break;
            }
            default: {
                DocumentWorker defdoc = new DocumentWorker();
                defdoc.openDocument();
                defdoc.editDocument();
                defdoc.saveDocument();
                break;
            }

        }

    }
}
