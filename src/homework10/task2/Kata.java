package homework10.task2;

public class Kata {
    public static int[] between(int a, int b) {
        int length = b - a + 1;


        int[] array = new int[length];
        int first = a;
        for (int j = 0; j < length; j++) {
            array[j] = first;
            first++;

        }
        return array;
    }

}
