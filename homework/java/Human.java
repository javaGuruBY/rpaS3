import java.util.Scanner;
public class Human {
    public String name;
    public int age;

    public void printInfo() {
        System.out.println("Hi! My name is " + this.name + ", I'm " + this.age + " years old");
    }

    public void vvodInfo() {
        Scanner in = new Scanner(System.in);
        System.out.println("введите ваше имя");
        this.name = in.nextLine();
        System.out.println("введите ваш возраст");
        this.age = in.nextInt();
    }
}