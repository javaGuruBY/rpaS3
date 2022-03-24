package by.jrr.start;

import org.junit.Assert;
import org.junit.Test;



public class ApplicationTest {

    @Test
    public void main() {

        int expected = 2;
        int actual = 2;
        Assert.assertEquals("This test will fail because of expected != actual", expected, actual);
    }}





