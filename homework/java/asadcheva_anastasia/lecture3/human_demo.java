package main.java.javaguru;

public class HumanDemo {
    public static void main(String[] args) {
        Human bob = new Human("Bob", 22);
        Human rosa = new Human("Rosa", 25);
        Human helen = new Human("Helen", 32);

        bob.greet(bob.name, bob.age);
        bob.greet(rosa.name, rosa.age);
        bob.greet(helen.name, helen.age);
    }
}

class Human {
    String name;
    int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void greet(String name, int age){
        System.out.println("Hi! My name is " + name +", I'm "+ age + " years old");
    }
}
