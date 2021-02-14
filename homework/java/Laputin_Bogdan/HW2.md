##HW2

#Task 1:

Разработать программу, которая демонстрирует работу с простейшими математическими операциями.

 
Функциональные требования:
 
1. Продемонстрировать работу с операциями сложения, вычитания, умножения и деления, и вывести результат вычислений на экран.

 
Нефункциональные требования:
 
1. Класс с демонстрацией должен называться "MathOperationsDemo".
 
 

#Solution:

```java
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
```


#Task 2:

Разработать программу, которая демонстрирует генерацию случайных чисел, а также различные действия над этими числами.
 
Функциональные требования:
 
1. Сгенерировать 3 случайных числа и вывести их на экран.
2. Посчитать сумму этих чисел и вывести результат на экран.
 
Нефункциональные требования:
 
1. Класс с демонстрацией должен называться "RandomGeneratorDemo".
2. Генерировать числа можно используя классы "Random" или "Math".



#Solution:

```java
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
```




