package lv.javaguru.demo;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args){
        Random randomGenerator = new Random();
        int num1 = randomGenerator.nextInt(300);
        int num2 = randomGenerator.nextInt(200);
        int num3 = randomGenerator.nextInt(100);
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        System.out.println("num3: "+num3);
        int summ = num1+num2+num3;
        System.out.println("summ: "+summ);
    }
}
