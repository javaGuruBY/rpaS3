package task2_Human;

public class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void greet() {
        System.out.println("Hi! My name is " + name + ", I'm " + age + " years old");
    }
}
