package by.jrr.start;

public class Calculator {

    private int result;

    public int multiplikation(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
