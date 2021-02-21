package randomNum.com;

public class RandomGeneratorDemo {



    public static void main(String[] args)
    {
        double randomNum1=Math.random() *10;// создаём рандомные значения от 0 до 10
        double randomNum2=Math.random() *10;
        double randomNum3=Math.random() *10;
        System.out.println("Сумма чисел="+(randomNum1+randomNum2+randomNum3));

    }



}
