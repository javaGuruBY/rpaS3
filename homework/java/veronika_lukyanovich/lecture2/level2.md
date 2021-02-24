import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int a = randomGenerator.nextInt(15);
        int b = randomGenerator.nextInt(35);

        System.out.println("Addition '+':");
        System.out.print("a 'random' = ");
        System.out.print(a);
        System.out.print(", ");
        System.out.print("b 'random' = ");
        System.out.print(b);

        int sum = a + b;
        System.out.println();
        System.out.print("a + b = ");
        System.out.print(a);
        System.out.print(" + ");
        System.out.print(b);
        System.out.print(" = ");
        System.out.print(sum);

    }
}
