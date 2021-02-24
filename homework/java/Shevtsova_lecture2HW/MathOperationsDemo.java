package lv.javaguru.demo;

public class MathOperationsDemo {
    public static void main(String[] args){
        //ADDITION
        int a = 40;
        int b = 10;
        int result = a+b;
        System.out.println("addition with int:" + a +" + "+ b+ " = "+ result );
        double c = 4.5;
        double d = 10.2;
        double doubleResult = c+d;
        System.out.println("addition with double: " + c +" + "+ d+ " = "+ doubleResult );
        //SUBTRACTION
        result = a-b;
        System.out.println("subtraction with int:" + a +" - "+ b+ " = "+ result );

        doubleResult = c-d;
        System.out.println("subtraction with double: " + c +" - "+ d+ " = "+ doubleResult );

        //MULTIPLICATION
        result = a*b;
        System.out.println("multiplication with int:" + a +" * "+ b+ " = "+ result );

        doubleResult = c*d;
        System.out.println("multiplication with double: " + c +" * "+ d+ " = "+ doubleResult );
        //DIVISION
        result = a/b;
        System.out.println("division with int:" + a +" / "+ b+ " = "+ result );

        doubleResult = c/d;
        System.out.println("division with double: " + c +" / "+ d+ " = "+ doubleResult );

        //REMAINDER
        System.out.println("multiplication with double: " + c +" * "+ d+ " = "+ doubleResult );
        //DIVISION
        result = a%b;
        System.out.println("int:" + a +" % "+ b+ " = "+ result );

        doubleResult = c%d;
        System.out.println("double: " + c +" % "+ d+ " = "+ doubleResult );

        //TYPE CONVERSION
        int x = 10;
        int y = 4;
        doubleResult = x / (double) y;
        System.out.println(x +" / (double) "+y +" = " + doubleResult);
    }
}
