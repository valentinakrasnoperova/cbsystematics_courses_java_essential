package homework10.task1;

import java.util.Arrays;

public class MyDictionary<TKey, TValue> implements IDictionary<TKey, TValue> {
    int count = 0;
    TKey[] TKeysArray;
    TValue[] TValuesArray;

    public MyDictionary(int element) {
        this.TValuesArray = (TValue[]) new Object[element];
        this.TKeysArray = (TKey[]) new Object[element];
    }

    @Override
    public void addElements(TKey key, TValue value) {
        int i = 0;
        for (TValue value2 : TValuesArray) {
            if (value2 == value) {
                System.out.println("This value already exists");
            } else i++;
        }
        if (i == TKeysArray.length) {
            this.TKeysArray[count] = key;
            this.TValuesArray[count] = value;
            count++;
        }
    }

    @Override
    public TValue valueOf(int i) {
        System.out.print("The value of " + i + "-number is : ");
        return this.TValuesArray[i];
    }

    @Override
    public int countPair() {
        System.out.print("The number of elements is: ");
        return this.count;
    }


    @Override
    public String toString() {
        return "MyDictionary : " + "\n" +
                "TKeysArray : " + Arrays.toString(TKeysArray) + "\n" +
                "TValuesArray : " + Arrays.toString(TValuesArray);
    }
}