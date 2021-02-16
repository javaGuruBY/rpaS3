package by.jrr.moodle.arithmetic_operations;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MathOperationsDemo {

    private static final Scanner scanner = new Scanner(System.in);
    private static BigDecimal tempCurrentValue = BigDecimal.ZERO;
    private static boolean flag = true;

    public static void main(String[] args) {
        toStart();
    }

    private static BigDecimal toEnterANumber() {
        flag = false;

        do {
            System.out.print("Enter a number ");
            if (scanner.hasNextBigDecimal()) {
                flag = true;
                return new BigDecimal(String.valueOf(scanner.nextBigDecimal()));
            }
            scanner.nextLine();
        } while (!flag);

        return null;
    }

    private static int toChooseTheOperation() {
        flag = false;
        int option = 0;

        System.out.print("""
                Choose the operation
                1 - Addition
                2 - Subtraction
                3 - Division
                4 - Multiplication
                5 - Clear
                6 - Exit
                """);

        do {
            System.out.print("Your choice\s");
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                if (option > 0 && option < 7) {
                    flag = true;
                }
            }

            scanner.nextLine();
        } while (!flag);

        return option;
    }

    private static void toCalculate(int option, BigDecimal x2) {
        switch (option) {
            case 1 -> tempCurrentValue = toAdd(x2);
            case 2 -> tempCurrentValue = toSubtract(x2);
            case 3 -> tempCurrentValue = toDivide(x2);
            case 4 -> tempCurrentValue = toMultiply(x2);
        }
    }

    private static void toClear() {
        tempCurrentValue = BigDecimal.ZERO;
    }

    private static BigDecimal toMultiply(BigDecimal x2) {
        return new BigDecimal(String.valueOf(tempCurrentValue.multiply(x2)));
    }

    private static BigDecimal toDivide(BigDecimal x2) {
        try {
            return new BigDecimal(String.valueOf(tempCurrentValue.divide(x2, 13, RoundingMode.HALF_UP)));
        } catch (ArithmeticException ex) {
            System.out.println("Division by zero is not possible");
        }
        return new BigDecimal(String.valueOf(tempCurrentValue));
    }

    private static BigDecimal toSubtract(BigDecimal x2) {
        return new BigDecimal(String.valueOf(tempCurrentValue.subtract(x2)));
    }

    private static BigDecimal toAdd(BigDecimal x2) {
        return new BigDecimal(String.valueOf(tempCurrentValue.add(x2)));
    }

    private static void toPrint() {
        if (tempCurrentValue.compareTo(tempCurrentValue.setScale(0, RoundingMode.DOWN)) == 0) {
            System.out.printf("=========================================\nScoreboard =%s\n=========================================\n\n\n", tempCurrentValue.setScale(0, RoundingMode.DOWN).toString());

        } else {
            System.out.printf("=========================================\nScoreboard =%s\n=========================================\n\n\n", tempCurrentValue.stripTrailingZeros().toString());
        }
        flag = true;
    }

    public static void toStart() {
        toPrint();
        tempCurrentValue = toEnterANumber();
        toPrint();

        while (flag) {
            int operation = toChooseTheOperation();
            if (operation == 5) {
                toClear();
                toStart();
            } else if (operation == 6) {
                System.exit(0);
            } else {
                toCalculate(operation, toEnterANumber());
            }
            toPrint();
        }
    }
}
