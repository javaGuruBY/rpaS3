##HW2

#Task 1:

Разработать программу, которая демонстрирует работу с простейшими математическими операциями.

Функциональные требования:

Продемонстрировать работу с операциями сложения, вычитания, умножения и деления, и вывести результат вычислений на экран.
Нефункциональные требования:

Класс с демонстрацией должен называться "MathOperationsDemo".
#Solution:

public class MathOperationsDemo
{
    public static void main(String [] args)
    {
        int a = 7;
        int b = 100;
        System.out.println(a + b);
        System.out.println(b / a);
        System.out.println(b % a);
        System.out.println(b - a);
        System.out.println(a * b);
    }
}
#Task 2:

Разработать программу, которая демонстрирует генерацию случайных чисел, а также различные действия над этими числами.

Функциональные требования:

Сгенерировать 3 случайных числа и вывести их на экран.
Посчитать сумму этих чисел и вывести результат на экран.
Нефункциональные требования:

Класс с демонстрацией должен называться "RandomGeneratorDemo".
Генерировать числа можно используя классы "Random" или "Math".
#Solution:

import java.util.Random;

public class RandomGeneratorDemo
{
        public static void main(String [] args)
        {
            Random num = new Random();
            int a = num.nextInt();
            int b = num.nextInt();
            int c = num.nextInt();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(a + b + c);
        }
}
