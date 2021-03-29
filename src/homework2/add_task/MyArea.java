package homework2.add_task;

import static java.lang.Math.pow;

public class MyArea {
    private static final float NUMBER_PI = 3.14F;

    static int areaOfCircle(int radius) {
        System.out.println("The area is : " + pow(radius, 2)*NUMBER_PI);
        return radius;
    }
}
