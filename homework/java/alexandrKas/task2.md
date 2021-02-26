public class MathOperationsDemo {

    public static void main(String[] args) {

    plus(5,4);
    minus(20,10);
    division(100,2);
    multiplication(6,2);

    }

    static void plus (int a, int b){
        System.out.println(a + b);
    }

    static void minus (int a, int b){
        System.out.println(a - b);
    }

    static void division (int a, int b){
        System.out.println(a / b);
    }

    static void multiplication (int a, int b){
        System.out.println(a * b);
    }
}