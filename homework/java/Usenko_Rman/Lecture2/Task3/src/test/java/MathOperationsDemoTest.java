import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MathOperationsDemoTest {

    double delta = 0.000001;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() {
    }

    @Test
    public void addition() {
        double a = 10;
        double b = 1;

        double expected = 11;
        double actual = MathOperationsDemo.addition(a, b);

        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void subtraction() {
        double a = 10;
        double b = 1;

        double expected = 9;
        double actual = MathOperationsDemo.subtraction(a, b);

        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void multiplication() {
        double a = 10;
        double b = 2;

        double expected = 20;
        double actual = MathOperationsDemo.multiplication(a, b);

        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void division() {
        double a = 10;
        double b = 5;

        double expected = 2;
        double actual = MathOperationsDemo.division(a, b);

        Assert.assertEquals(expected, actual, delta);
    }


    @Test(expected = ArithmeticException.class)
    public void finalDivision() {

//        assertEquals(2,MathOperationsDemo.finalDivision(10,5),delta);
        MathOperationsDemo.finalDivision(10,0);

    }

    @Test
    public void numberIsZero() {
        assertFalse(MathOperationsDemo.numberIsZero(1));
        assertTrue(MathOperationsDemo.numberIsZero(0));

    }
}