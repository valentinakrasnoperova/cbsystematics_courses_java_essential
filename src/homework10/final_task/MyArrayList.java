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

    int get(int index) {
        if (index < 0 || index > myArray.length) {
            throw new ArrayIndexOutOfBoundsException("Wrong index number");
        }
        return (int) this.myArray[index];
    }

    void remove(int index) {
        if (index < 0 || index > myArray.length) {
            throw new ArrayIndexOutOfBoundsException("Wrong index number");
        }
        int newArrayCapacity = myArray.length - 1;
        Object[] newArray2 = new Object[newArrayCapacity];
        System.arraycopy(myArray, 0, newArray2, 0, index);
        System.arraycopy(myArray, index + 1, newArray2, index, newArrayCapacity - index);
        myArray = newArray2;
    }

    int indexOf(T value) {
        for (Object o : myArray) {
            if (o == value) {
                return (int) o;
            }
        }
        return -1;

    }

    int size() {
        return myArray.length;
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
        if (myArray.length == 0) {
            return true;
        }

        return false;
    }


    void grow() {

        Object[] newArray = new Object[capacity *= 2];
        newArray = Arrays.copyOf(myArray, newArray.length);
        myArray = newArray;
    }
}
