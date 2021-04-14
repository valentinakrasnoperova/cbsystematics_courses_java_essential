package homework8.task3;

import homework8.task2.Worker;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String shopName;
        String product;
        String shop;
        int price;
        Price[] priceArr = new Price[2];

        try {
            for (int i = 0; i < priceArr.length; i++) {
                System.out.println("Enter the product name : ");
                product = input.next();
                System.out.println("Enter the shop where you can find this product : ");
                shop = input.next();
                System.out.println("Enter the price of the product : ");
                price = Integer.parseInt(input.next());
                priceArr[i] = new Price(product, shop, price);

            }
        } catch (NumberFormatException e) {
            System.err.println("Wrong number format");
        }

        Arrays.sort(priceArr, Price::compareTo);
        for (Price price1 : priceArr) {
            System.out.println(price1);
        }

        System.out.println("Enter the shop name : ");
        shopName = input.next();
        for (Price price1 : priceArr) {

            if (price1.shop.equalsIgnoreCase(shopName)) {
                System.out.println(price1.product);
            } else {
                try {
                    throw new Exception("The shop, you are looking for does not exist");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        }
    }
}




