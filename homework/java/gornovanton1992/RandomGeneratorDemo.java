import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random ran = new Random();
        int num1 = ran.nextInt();
        int num2 = ran.nextInt();
        int num3 = ran.nextInt();
        System.out.println("сгенерированы 3 случайных числа " + num1 +", " + num2 + " ," + num3 );
        System.out.println("сумма этих чисел равна " + (num1 + num2 + num3));

    }
}