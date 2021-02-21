package by.jrr.start;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationTest {

    @Test
    public void main() {

        int expected = 1;

        int actual = Integer.valueOf("2");

        Assert.assertEquals("Failed", expected, actual);
    }
}
