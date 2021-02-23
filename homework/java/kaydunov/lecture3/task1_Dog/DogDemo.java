package task1_Dog;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog(12, "Black", "Archi");
        Dog dog2 = new Dog(1, "White", "Apple");

        System.out.println(dog1.Age);
        System.out.println(dog1.getAge());

        dog1.eat();
        dog2.voice();
        dog1.voice();

    }
}
