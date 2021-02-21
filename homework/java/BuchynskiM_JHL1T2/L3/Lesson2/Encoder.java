package Lecture3_Level2;

public class Encoder {
    private short code;
    private  char symbol;

    public Encoder(short code) {
        this.code = code;
    }

    public Encoder(char symbol) {
        this.symbol = symbol;
    }

    public short getCode() {
        return code;
    }

    public void setCode(short code) {
        this.code = code;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void encode(short code){

        char result = (char)code;
        System.out.println("The result of encode code " + code + " => " + result);
    }

    public void decode(char symbol){

        short result = (short)symbol;
        System.out.println("The result of decode symbol " + symbol + " => " + result);
    }
}
