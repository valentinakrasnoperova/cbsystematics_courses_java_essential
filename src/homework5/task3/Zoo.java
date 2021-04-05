package homework5.task3;

import java.util.ArrayList;

public class Zoo {
    ArrayList<String> animals = new ArrayList<>();

    public void Show() {
        animals.add(0, "Tiger");
        animals.add(1, "Lion");
        animals.add(2, "Bear");
        animals.add(3, "Ostrich");
        animals.add(4, "Crocodile");
        animals.add(5, "Rhinoceros");
        animals.add(6, "Elephant");
        animals.add(7, "Racoon");

        animals.remove(3);
        animals.remove(4);
        animals.remove(5);

        System.out.println(animals);
        System.out.println(animals.size());



    }
}
