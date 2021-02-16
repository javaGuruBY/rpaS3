package com.javacourse.se.lecture2_l2;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int summa;

        Random randomGenerator;
        randomGenerator = new Random();

        a = randomGenerator.nextInt(20) ;
        b = randomGenerator.nextInt(20);
        c = randomGenerator.nextInt(20);
        summa = a+b+c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("Сумма чисел " +summa);


    }
}
