package io.yurasava.github;

import java.util.Random;

public class RandomGeneratorDemo {

    public static void main(String[] args) {

        Random randomGenetator = new Random();
        int firstRandom = randomGenetator.nextInt(333);
        int secondRandom = randomGenetator.nextInt(222);
        int thirdRandom = randomGenetator.nextInt(111);

        int sum = firstRandom + secondRandom + thirdRandom;

        System.out.println("firstRandom = " + firstRandom);
        System.out.println("secondRandom = " + secondRandom);
        System.out.println("thirdRandom = " + thirdRandom);

        System.out.println("Sum = " + sum);

    }
}
