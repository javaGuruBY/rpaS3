package by.jrr.start;

public class PhraseAnalyser
{
    public String analyse(String text) {
        int tmp1 = text.indexOf("Make");
        int tmp2 = text.indexOf("great again");
        if (tmp1 == 0 && (text.length() - tmp2 == 11))
        {
            return "It stands no chance";
        }
        else if (tmp1 == 0 || (text.length() - tmp2 == 11))
        {
            return "It could be worse";
        }
        else
        {
            return "It is fine, really";
        }
    }
}
