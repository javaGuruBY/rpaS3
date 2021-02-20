public class Product {
    public String name;
    double regularPrice;
    double discount;

    public Product(String name){
                this.name = name;}

     double actualPrice(){
 return  (regularPrice*(100-discount))/100;     }

    void printInformation() {
        System.out.println("Product - "+name);
        System.out.println("Regular price - "+regularPrice+" BYN");
        System.out.println("Discount - "+discount+"%");
        System.out.println("Actual Price - "+actualPrice()+" BYN");}
}
