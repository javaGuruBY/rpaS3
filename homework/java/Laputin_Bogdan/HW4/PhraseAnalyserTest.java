package by.jrr.start;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhraseAnalyserTest {

    PhraseAnalyser phrase;

    @Before
    public void setup()

    {
        phrase = new PhraseAnalyser();
    }

    @Test
    public void test1()
    {
        String expected = "It stands no chance";
        String actual = phrase.analyse("Make America great again");
        assertEquals(expected, actual);
    }

    @Test
    public void test2()
    {
        String expected = "It could be worse";
        String actual = phrase.analyse("Make it faster");
        assertEquals(expected, actual);
    }

    @Test
    public void test3()
    {
        String expected = "It is fine, really";
        String actual = phrase.analyse("I like pancakes");
        assertEquals(expected, actual);
    }
}