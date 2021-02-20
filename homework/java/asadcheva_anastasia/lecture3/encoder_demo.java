package main.java.javaguru;

public class EncoderDemo {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        encoder.encode((short) 65);
        encoder.decode('X');
    }
}

class Encoder{

    void encode(short code){
        char encode = (char) code;
        System.out.println(code + " => " + encode);
    }
    void decode(char symbol){
        short decode = (short) symbol;
        System.out.println(symbol + " => " + decode);
    }
}
