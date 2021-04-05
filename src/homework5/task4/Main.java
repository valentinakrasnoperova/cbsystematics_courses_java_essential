package homework5.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listOfWholeNumbers = new ArrayList<>();
        for (int i = 10; i <= 20; i++) {
            listOfWholeNumbers.add(i);
        }

        int min = listOfWholeNumbers.get(0);
        int max = listOfWholeNumbers.get(0);

        System.out.println(listOfWholeNumbers);
        for (Integer i : listOfWholeNumbers) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("The min is : " + min);
        System.out.println("The max is : " + max);

        ListIterator<Integer> newlist = listOfWholeNumbers.listIterator();

        while (newlist.hasNext()) {
            listOfWholeNumbers.set(0, newlist.nextIndex() + 1);
            System.out.println(newlist.next());
        }
    }
}
