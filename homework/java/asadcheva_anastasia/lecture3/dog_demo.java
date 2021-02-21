package main.java.javaguru;

public class DogDemo {
    public static void main (String[] arg){
        Dog dog1 = new Dog(5, "white", "Бобик");
        System.out.println(dog1.name + ":");

        dog1.voice();
        dog1.eat();
        dog1.sleep();
    }
}

class Dog {
    int age;
    String color;
    String name;


    public Dog (int age,
            String color,
            String name){
        this.age = age;
        this.color = color;
        this.name = name;
    }

    void voice(){
        System.out.println("Гав-гав!");
    }
    void eat(){
        System.out.println("Я голоден!");
    }
    void sleep(){
        System.out.println("Хочу спать!");
    }
}
