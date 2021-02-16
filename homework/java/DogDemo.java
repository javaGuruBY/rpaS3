public class DogDemo {
    public static void main(String[] args) {
        Dog Dog1 = new Dog(10, "черная", "овчарка");
        Dog Dog2 = new Dog(4, "шоколадный", "пудель");
        Dog1.voice();
        Dog2.voice();
        Dog1.eat();
        Dog2.eat();
        Dog1.sleep();
        Dog2.sleep();
        Dog1.printInfo();
        Dog2.printInfo();
    }
}
