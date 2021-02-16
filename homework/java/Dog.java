import java.util.Random;

public class Dog {
    public int age;
    public String color;
    public String name;
    public String feed;
    public String wow;
    public String status;

    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void printInfo() {
        System.out.println();
        System.out.print(this.age + " лет ");
        System.out.print(this.color);
        System.out.print(" " + this.name);
        System.out.print(" " + this.feed);
        System.out.print(" " + this.wow);
        System.out.print(" " + this.status);
    }

    public void eat() {
        Random randomGenerator = new Random();
        int gen = randomGenerator.nextInt(2);
        if (gen == 1) {
            this.feed = "поела";
        } else {
            this.feed = "не ела";
        }
    }

    public void voice() {
        Random randomGenerator = new Random();
        int gen = randomGenerator.nextInt(2);
        if (gen == 1) {
            this.wow = "лает";
        } else {
            this.wow = "не лает";
        }
    }

    public void sleep() {
        if ((this.feed == "не поела") || (this.wow == "лает")) {
            this.status = "не спит";
        } else {
            this.status = "спит";}
    }
}
