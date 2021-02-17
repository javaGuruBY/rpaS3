package by.jrr;

import java.util.Random;
import java.security.SecureRandom;

public class Application {
    public static void main(String[] args) {

        Numbers number=new Numbers();

        SecureRandom randomGenerator = new SecureRandom();
        number.setA(randomGenerator.nextInt(1000));
        number.setB(randomGenerator.nextInt(1000));
        number.setC(randomGenerator.nextInt(10));


        System.out.println("Number a = "+number.getA()+" Number b = "+number.getB()+" Number c = "+number.getC());
        System.out.println("Sum of numbers a+b+c = "+number.sum());
    }
    public static class Numbers{
        private int a;
        private int b;
        private int c;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getC() {
            return c;
        }

        public void setC(int c) {
            this.c = c;
        }

        public int sum(){
           return this.a+this.b+this.c;
        }

    }
}