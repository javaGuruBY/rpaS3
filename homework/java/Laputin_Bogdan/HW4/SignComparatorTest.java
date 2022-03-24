package by.jrr.start;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SignComparatorTest
{

    SignComparator num;

    @Before
        public void setup()
    {
        num = new SignComparator();
    }

    @Test
    public void test1()
    {
        String expected = "Number is positive";
        String actual = num.compare(3);
        assertEquals(expected, actual);
    }

    @Test
    public void test2()
    {
        String expected = "Number is equal to zero";
        String actual = num.compare(0);
        assertEquals(expected, actual);
    }

    @Test
    public void test3()
    {
        String expected = "Number is negative";
        String actual = num.compare(-3);
        assertEquals(expected, actual);
    }
}