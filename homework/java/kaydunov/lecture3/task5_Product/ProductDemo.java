package task5_Product;

public class ProductDemo {

    public static void main(String[] args) {
        Product product1 = new Product("Candom");
        Product product2 = new Product("Vine");

        product1.setDiscount(0.15);
        product1.setRegularPrice(100);
        product2.setRegularPrice(200);

        product1.printInformation();
        product2.printInformation();
    }
}
