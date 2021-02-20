public class ProductDemo {
    public static void main (String[] args){
        Product product = new Product("Bread");
        product.discount = 27.5;
        product.regularPrice = 186;
        product.printInformation();
    }
}
