package main.java.javaguru;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Milk";
        product.regularPrice = 0.8;
        product.discount = 20;

        product.printInformation();
    }
}
 class Product{
     String name;
     double regularPrice;
     double discount;

     double actualPrice(){
         double sumSale = regularPrice*discount/100;
         return regularPrice - sumSale;
     }
     void printInformation(){
        System.out.println("Product: " + name + ", \n" + "regular price: "+ regularPrice +" EUR, \ndiscount: "+ discount+"%, \nactual price: "+ actualPrice() +" EUR");
     }
 }
