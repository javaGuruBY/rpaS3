package Lecture3_Level2;

public class EncoderDemo {
    public static void main(String[] args) {
        Encoder decoder = new Encoder('A');
        Encoder encoder = new Encoder((short)65);

        encoder.encode(encoder.getCode());
        decoder.decode(decoder.getSymbol());

        decoder.setSymbol('S');
        encoder.setCode((short)88);

        encoder.encode(encoder.getCode());
        decoder.decode(decoder.getSymbol());
    }
}
