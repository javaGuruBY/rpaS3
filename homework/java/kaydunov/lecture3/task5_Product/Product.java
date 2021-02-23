package task5_Product;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name) {
        this.name = name;
    }

    double actualPrice() {
        if (regularPrice < 0 || discount < 0 || discount > 1) {
            System.out.println("Product - " + name + " were input error value. Enter correct value.");
            System.exit(0);
        }
        return regularPrice * (1- discount);
    }

    void printInformation() {
        System.out.printf("Product : name = %s, regular price = %.2f EUR, discount = %.2f%% actual price = %.2f EUR\n",
                name, regularPrice, discount, actualPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }


    public double getDiscount() {
        return discount;
    }

    /**
     * Enter dooble number from 0 to 1.
     * @param discount
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
