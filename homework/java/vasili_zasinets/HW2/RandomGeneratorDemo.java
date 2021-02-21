import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random ranGen = new Random();
        int x = ranGen.nextInt();
        int y = ranGen.nextInt();
        int z = ranGen.nextInt();

        System.out.println("Вас приветствует программа демонстрации генерирования случайных чисел и выполнения операции с ними");
        System.out.println(" ");
        System.out.println("Генерируем число a");
        System.out.println(x);
        System.out.println(" ");
        System.out.println("Генерируем число b");
        System.out.println(y);
        System.out.println(" ");
        System.out.println("Генерируем число c");
        System.out.println(z);

        System.out.println(" ");
        System.out.println("Сумма сгенерированных чисел");
 int c = x+y+z;
        System.out.println(c);
        System.out.println(" ");

        System.out.println("Благодарю за использование программы. Хорошего дня.");
    }}

