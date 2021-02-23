package by.jrr.start;

public class Calculator {

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }


    static private int result;

    public int multiplikation(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a/b;
    }


}
