package io.yurasava.github;

public class MathOperationsDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Mathoperations'!");

        int a = 68;
        int b = 25;
        int sum = a + b;

        System.out.println("1) Addition '+':");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + a + " + " + b + " = " + sum);

        System.out.println();
        System.out.println("2) Substraction '-':");

        long x = 466789;
        long y = 73637;
        long difference = x - y;

        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x - y = " + x + " - " + y + " = " + difference);

        System.out.println();
        System.out.println("3) Division '/':");

        short m = 28;
        short n = 7;

        System.out.println("m = " + m + ", n = " + n);
        System.out.println("m / n = " + m + " / " + n + " = " + 28 / 7);

        System.out.println();
        System.out.println("4) Multiplication '*':");

        short c = 34;
        short d = 14;

        System.out.println("c = " + c + ", d = " + d);
        System.out.println("c * d = " + c + " * " + d + " = " + 34 * 14);

        System.out.println();
        System.out.println("5) Reminder '%':");

        long k = 36778;
        long s = 56;

        System.out.println("k = " + k + ",s = " + s);
        System.out.println("k % s = " + k + " % " + s + " = " + 36778 % 56);

    }
}
