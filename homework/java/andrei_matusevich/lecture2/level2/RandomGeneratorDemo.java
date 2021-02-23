package Iv.javaguru.demo;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int firstRandNum = randomGenerator.nextInt();
        int secondRandNum = randomGenerator.nextInt();
        int therdRAndNum = randomGenerator.nextInt();
        int randomSum = firstRandNum + secondRandNum + therdRAndNum;
        System.out.println("Первое случайное число = " + firstRandNum);
        System.out.println("Второе случайное число = " + secondRandNum);
        System.out.println("Третье случайное число = " + therdRAndNum );
        System.out.println("Сумма чисел ровна: " +randomSum);

    }
}
