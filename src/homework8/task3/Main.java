package homework8.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String shopName;

        Price[] priceArr = new Price[2];
        for (int i = 0; i < priceArr.length; i++) {
            String product;
            String shop;
            int price;

            System.out.println("Enter the product name : ");
            product = input.next();
            System.out.println("Enter the shop where you can find this product : ");
            shop = input.next();
            System.out.println("Enter the price of the product : ");
            price = Integer.parseInt(input.next());
            priceArr[i] = new Price(product, shop, price);

        }

        Arrays.sort(priceArr, Price::compareTo);
        for (Price price : priceArr) {
            System.out.println(price);
        }

        System.out.println("Enter the shop name : ");
        shopName = input.next();
        for (Price price : priceArr) {

            if (price.shop.equalsIgnoreCase(shopName)) {
                System.out.println(price.product);
            } else {
                try {
                    throw new MyException();
                } catch (MyException e) {
                    e.myException();
                }
            }

        }
    }
}

class MyException extends Exception {

    public void myException() {
        System.out.println("The shop, you are looking for does not exist");
    }
}

