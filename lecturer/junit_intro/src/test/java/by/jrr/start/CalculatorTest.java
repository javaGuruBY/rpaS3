package by.jrr.start;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("setUp");
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
        calculator = null;
    }

    @BeforeClass
    public static void globalSetUp() {
        System.out.println("globalSetUp");

    }

    @AfterClass
    public static void GlobalTearDown() {
        System.out.println("GlobalTearDown");

    }

    @Test
    public void sum() {
        int a = 4;
        int b = 3;

        int expected = 7;
        int actual = calculator.sum(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void subs() {
        int a = 4;
        int b = 3;

        int expected = 1;
        int actual = calculator.subs(a, b);

        assertEquals(expected, actual);

    }

    @Test
    public void calculateSumThenSubs() {
        int a = 4;
        int b = 3;
        int c = -5;

        int expected = 12;
        calculator.setResult(calculator.sum(a, b));
        calculator.setResult(calculator.subs(calculator.getResult(), c));

        int actual = calculator.getResult();

        assertEquals(expected, actual);
    }

    @Test
    public void calculateSubsThenSum() {
        int a = 4;
        int b = 3;
        int c = -5;

        int expected = -4;
        calculator.setResult(calculator.subs(a, b));
        calculator.setResult(calculator.sum(calculator.getResult(), c));

        int actual = calculator.getResult();

        assertEquals(expected, actual);
    }
}
