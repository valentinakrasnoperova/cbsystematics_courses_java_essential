package homework10.task1;

public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> myDictionary = new MyDictionary<>(5);
        myDictionary.addElements(1, "bla");
        myDictionary.addElements(2, "bla1");
        myDictionary.addElements(3, "bla2");
        myDictionary.addElements(4, "bla3");
        myDictionary.addElements(5, "bla4");
        System.out.println(myDictionary);
        System.out.println(myDictionary.valueOf(1));
        System.out.println(myDictionary.countPair());
    }
}
