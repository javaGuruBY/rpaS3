package com.javajuru;

import java.util.Random;
//Сгенерировать 3 случайных числа и вывести их на экран.
//Посчитать сумму этих чисел и вывести результат на экран.

public class RandomGeneratorDemo {
    public static void main (String[] args){
        Random random = new Random();
        int num1 = random.nextInt();
        int num2 = random.nextInt();
        int num3 = random.nextInt();
        int sum = num1 + num2 + num3;

        System.out.println("First random number:" + num1 + "\n" +
                "Second random number:" + num2 + "\n" +
                "Third random number:" + num3 + "\n" +
                "Sum of random number:" + sum);
    }
}
