package src;

import java.util.Scanner;

public class MathOperationsDemo {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

        System.out.println("Вас приветствует программа демонстрации выполнения простеших математических операций");
        System.out.println(" ");
    System.out.println("Для получения суммы a+b");
    System.out.println("Введите значение a");
    int a = s.nextInt ();
    System.out.println("Введите значение b");
    int b = s.nextInt ();
    System.out.println("Сумма a+b="+(a+b));
        System.out.println(" ");
    System.out.println("Для получения разницы a-b");
    System.out.println("Введите значение a");
    int x = s.nextInt ();
    System.out.println("Введите значение b");
    int y = s.nextInt ();
    System.out.println("Разница a-b="+(x-y));
        System.out.println(" ");
    System.out.println("Для выполнения умножения a*b");
    System.out.println("Введите значение a");
    int z = s.nextInt ();
    System.out.println("Введите значение b");
    int v = s.nextInt ();
    System.out.println("Значение a*b="+(z*v));
        System.out.println(" ");
    System.out.println("Для выполнения деления a/b");
    System.out.println("Введите значение a");
    float d = s.nextInt ();
    System.out.println("Введите значение b");
    float k = s.nextInt ();
    System.out.println("Значение a/b="+(d/k));
        System.out.println(" ");
        System.out.println("Благодарю за использование программы. Хорошего дня.");
}}
