package task4_Encoder;

public class EncoderDemo {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        char simb = 'A';
        short number = 129;

        System.out.println("simb = " + simb);
        System.out.println("number = " + number);
        encoder.decode(simb);
        encoder.encode(number);
    }
}
