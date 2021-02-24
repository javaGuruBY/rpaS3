package task4_Encoder;

public class Encoder {

    void encode(short code) {
        System.out.println((code + " = " + (char)code));
    }

    void decode(char simbol) {
        System.out.println(simbol + " = " + Character.getNumericValue(simbol));
    }

}
