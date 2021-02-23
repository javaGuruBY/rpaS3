package task1_Dog;

public class Dog {
    public int Age;
    public String color;
    public String name;

    public Dog(int age, String color, String name) {
        Age = age;
        this.color = color;
        this.name = name;
    }

    public void voice() {
        System.out.println(name + " ask: Wow!");
    }

    public void eat() {
        System.out.println("Dog " + name + " eat");
    }

    public void sleep() {
        System.out.println("Dog " + name + " sleep...");
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
