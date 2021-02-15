package com.javajuru;

// Продемонстрировать работу с операциями сложения,
// вычитания, умножения и деления, и вывести результат
// вычислений на экран.

import java.util.Scanner;

public class MathOperationsDemo {
    public static void main(String[] args) {
        Scanner scFirst = new Scanner(System.in);
        System.out.println("Введите первое число:");

        if (scFirst.hasNextInt()){
            Scanner scSecond = new Scanner(System.in);
            System.out.println("Введите второе число:");

            if ( scSecond.hasNextInt()){
                int userNumFirst = scFirst.nextInt();
                int userNumSecond = scSecond.nextInt();

                int sum = userNumFirst + userNumSecond;
                int min = userNumFirst - userNumSecond;
                int multipl = userNumFirst * userNumSecond;
                float dev = (float) userNumFirst/userNumSecond;

                System.out.println("Результат сложения: " + sum + "\n" +
                        "Результат вычитания: " + min + "\n" +
                        "Результат умножения: " + multipl + "\n" +
                        "Результат деления: " + dev);
            } else {
                System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
            }
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }
}
