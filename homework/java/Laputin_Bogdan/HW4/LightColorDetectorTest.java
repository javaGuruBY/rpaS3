package by.jrr.start;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LightColorDetectorTest {

    LightColorDetector wave;

    @Before
    public void setup()
    {
        wave = new LightColorDetector();
    }

    @Test
    public void test1()
    {
        String expected = "Blue";
        String actual = wave.detect(470);
        assertEquals(expected, actual);
    }

    @Test
    public void test2()
    {
        String expected = "Red";
        String actual = wave.detect(630);
        assertEquals(expected, actual);
    }

    @Test
    public void test3()
    {
        String expected = "Yellow";
        String actual = wave.detect(580);
        assertEquals(expected, actual);
    }

    @Test
    public void test4()
    {
        String expected = "Green";
        String actual = wave.detect(500);
        assertEquals(expected, actual);
    }

    @Test
    public void test5()
    {
        String expected = "Invisible Light";
        String actual = wave.detect(9999);
        assertEquals(expected, actual);
    }
}