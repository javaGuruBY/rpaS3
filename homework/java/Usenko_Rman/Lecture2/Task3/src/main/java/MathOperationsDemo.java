public class MathOperationsDemo {

    static double result;

    public static void main(String[] args) {
    }

    public static double addition(double a, double b) {
        result = a + b;
        return result;
    }

    public static double subtraction(double a, double b) {
        result = a - b;
        return result;
    }

    public static double multiplication(double a, double b) {
        result = a * b;
        return result;
    }

    public static double finalDivision(double a, double b) {
        try {
            if (numberIsZero(b)) throw new ArithmeticException("Denominator is 0");
            result = division(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static double division(double a, double b) {
        result = a / b;
        return result;
    }

    public static boolean numberIsZero(double b) {
        return b == 0;
    }
}


