import java.util.Scanner;

public class MathOperationsDemo {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);                   // вызов функции для ввода числа из консоли в программу//
        System.out.println("введите первое слогаемое");
        int a = in.nextInt();                               // ввод числа в программу//
        System.out.println("введите второе слогаемое");
        int b = in.nextInt();
        System.out.println("сумма чисел равна " + (a + b));
        System.out.println();

        Scanner in1 = new Scanner(System.in);
        System.out.println("введите уменьшаемое");
        a = in1.nextInt();
        System.out.println("введите вычетаемое");
        b = in1.nextInt();
        System.out.println("разность чисел равна " + (a - b));
        System.out.println();

        Scanner in2 = new Scanner(System.in);
        System.out.println("введите первый множитель ");
        a = in2.nextInt();
        System.out.println("введите второй множитель");
        b = in2.nextInt();
        System.out.println("произведение равно " + (a * b));
        System.out.println();

        Scanner in3 = new Scanner(System.in);
        System.out.println("введите делимое ");
        float c = in3.nextInt();
        System.out.println("введите делитель");
        float d = in3.nextInt();
        System.out.println("частное равно " + (c / d));
    }
}