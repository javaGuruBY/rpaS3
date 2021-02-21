package Lecture3_Level3;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double actualPrice() {
        return regularPrice - regularPrice * discount / 100;
    }

    public void printInformation(){
        System.out.println("Product : name = " + name + ", regular price = " + regularPrice + " EUR, discount = " + discount + ", actual price = " + actualPrice() + " EUR");
    }
}
