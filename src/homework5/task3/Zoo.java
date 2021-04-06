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

        String third = animals.get(3);
        String fifth = animals.get(5);
        String seventh = animals.get(7);

        animals.remove(third);
        animals.remove(fifth);
        animals.remove(seventh);

        System.out.println(animals);
        System.out.println(animals.size());


    }
}
