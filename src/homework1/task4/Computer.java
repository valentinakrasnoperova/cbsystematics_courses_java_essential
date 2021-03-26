package homework1.task4;

import java.util.Arrays;

public class Computer {
    String element;
    public Computer(){
        this.element = element;
    }

    public static void main(String[] args) {
        Computer[] computer = new Computer[5];

        computer[0] = new Computer();
        computer[1] = new Computer();
        computer[2] = new Computer();
        computer[3] = new Computer();
        computer[4] = new Computer();

        for (int i = 0; i < computer.length; i++) {
            computer[i].element = "element" + i;
        }

        System.out.print(Arrays.toString(computer));

    }
}
