public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void greet() {
        System.out.println("\"Hi! My name is " + name + ", I'm " + age + " years old\"");
    }
}