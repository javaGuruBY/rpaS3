import java.util.Random;

public class RandomDemo {
    public RandomDemo() {
}

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int a = randomGenerator.nextInt();
        int b = randomGenerator.nextInt(4500);
        int c = randomGenerator.nextInt(50);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Сумма трех рандомных чисел:");
        System.out.println(a + b + c);
    }
}

