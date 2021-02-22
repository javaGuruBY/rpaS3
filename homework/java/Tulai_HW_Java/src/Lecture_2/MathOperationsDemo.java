import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class MathOperationsDemo {
    //1. Продемонстрировать работу с операциями сложения, вычитания, умножения и деления, и вывести результат вычислений на экран.

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        {

            System.out.println("Введите значение а: ");
            int a = 0;
            try {
                a = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Введите оператор(+, -, *, /): ");
            String operator = null;
            try {
                operator = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Введите значение b: ");
            int b = 0;
            try {
                b = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch (Objects.requireNonNull(operator)) {
                case "+" -> {
                    System.out.println(a + b);
                }
                case "/" -> {
                    System.out.println(a / b);
                }
                case "*" -> {
                    System.out.println(a * b);
                }
                case "-" -> {
                    System.out.println(a - b);
                }
            }
        }
    }
}
