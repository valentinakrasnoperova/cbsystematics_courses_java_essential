package homework8.task3;


public class Price implements Comparable<Price> {
    String product;
    String shop;
    int price;

    public Price(String product, String shop, int price){
        this.product=product;
        this.shop=shop;
        this.price=price;
    }

    @Override
    public String toString() {
        return "product : " + product + ", shop : " + shop  + ", price : " + price ;
    }

    @Override
    public int compareTo(Price other) {
        return (this.shop.compareTo(other.shop));
    }
}
