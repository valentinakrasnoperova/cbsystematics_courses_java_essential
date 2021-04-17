package homework10.final_task;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(10);
        for (int i = 0; i < 10; i++) {
            myArrayList.add(i);
        }
        myArrayList.set(1, 4);
        myArrayList.remove(3);
        System.out.println(myArrayList);
        System.out.println("Value of element : " + myArrayList.get(1));
        System.out.println("Size of array: " + myArrayList.size());
        System.out.println("Index of element: " + myArrayList.indexOf(7));
        System.out.println("Is empty : " + myArrayList.isEmpty());
        myArrayList.clear();
        System.out.println(myArrayList);//after clearing
    }
}
