
public class Encoder {
    public Encoder (){}
    short code;
    char symbol;
    int c;

    void encode(short code) {
        if (code<0) code = (short) (-1*code);
        while (code>25) code= (short) (code/2);
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
           char sym = alfabet.charAt(code);
System.out.println("symbol = " + sym);    }

    void decode(char symbol){
    String alfabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int j = alfabet.indexOf(symbol);
        c = (j*j*j+23)/15;
        System.out.println("code = " + c);}
}
