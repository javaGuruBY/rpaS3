package Lecture3_Level3;

public class ProductDemo {
    public static void main(String[] args) {
        Product milk = new Product("Milk");
        Product eggs = new Product("Eggs");
        Product meat = new Product("Meat");

        milk.setRegularPrice(1.05);
        milk.setDiscount(20);
        eggs.setRegularPrice(2.33);
        eggs.setDiscount(15);
        meat.setRegularPrice(7.47);
        meat.setDiscount(7);

        milk.printInformation();
        eggs.printInformation();
        meat.printInformation();

    }
}
