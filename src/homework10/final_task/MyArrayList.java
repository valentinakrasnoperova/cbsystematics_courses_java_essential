package homework10.final_task;

import java.util.Arrays;

public class MyArrayList<T> {
    private int index;
    private int capacity;
    Object[] myArray;

    public MyArrayList(int capacity) {
        myArray = new Object[capacity];
    }

    void add(T value) {
        if (index == myArray.length) {
            grow();
        }
        myArray[index++] = value;
    }

    void set(int index, T value) {
        if (index < 0 || index > myArray.length) {
            throw new ArrayIndexOutOfBoundsException("Wrong index number");
        }
        this.myArray[index] = value;
    }

    Object get(int index) {
        if (index < 0 || index > myArray.length) {
            throw new ArrayIndexOutOfBoundsException("Wrong index number");
        }
        return this.myArray[index];
    }

    void remove(int index) {
        if (index < 0 || index > myArray.length) {
            throw new ArrayIndexOutOfBoundsException("Wrong index number");
        }
        for (int i = index; i <= this.index; i++) {

            myArray[i] = myArray[i + 1];
            myArray[this.index - 1] = null;
            this.index--;
        }


    }

    int indexOf(T value) {
        for (Object o : myArray) {
            if (o.equals(value)) {
                return (int) o;
            }
        }
        return -1;

    }

    int size() {
        return index;
    }

    @Override
    public String toString() {
        return "MyArrayList: " + "\n" +
                "myArray : " + Arrays.toString(myArray);
    }

    void clear() {
        Arrays.fill(myArray, null);
    }

    boolean isEmpty() {
        boolean i;
        int count = 0;
        for (Object o : myArray) {
            if (o != null) {
                count++;
            }
        }
        return i = (count == 0) && true || (count != 0) && false;
    }


    void grow() {

        Object[] newArray = new Object[capacity *= 2];
        newArray = Arrays.copyOf(myArray, newArray.length);
        myArray = newArray;
    }
}
