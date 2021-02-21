package SimpleMath.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleMath {

    public static void main(String[] args) throws IOException {
        System.out.print("Введите число a:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите число b:");
        int b = Integer.parseInt(reader.readLine());
        menu();
        int choice=Integer.parseInt(reader.readLine());

        switch(choice)
        {
            case 1:
                System.out.println(sumOfNum(a,b));
                    break;
            case 2:
                System.out.println(numDifference(a,b));
                     break;
            case 3:
                System.out.println(numProduct(a,b));
                     break;
            case 4:
                System.out.println(numDivision(a,b));
                    break;
            default:
                break;
        }


    }

    public static void  menu()

    {
        System.out.println("Выберете необходимую операцию:"+"\n");
        System.out.println("1-Операция сложения");
        System.out.println("2-Операция вычитания");
        System.out.println("3-Операция умножения");
        System.out.println("4-Операция деления");

    }
    public static double sumOfNum (double a, double b)
    {
        return a+b;

    }
    public static double numDifference  (double a, double b)
    {
        return a-b;

    }
    public static double numDivision (double a, double b)
    {
        return a/b;

    }
    public static double numProduct (double a, double b)
    {
        return a*b;

    }

}
