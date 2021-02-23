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
    public void testDivision() {
        int a = 12;
        int b = 4;
        int expected = 3;
        int actual = calculator.division(a,b);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplikation() {
        int a = 3;
        int b = 4;
        int expected = 12;
        int actual = calculator.multiplikation(a,b);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateMultiplicationThenDivision() {
        int a = 3;
        int b = 4;
        int c = 2;
        int expected = 0;
        int actual = calculator.getResult();
        assertEquals(expected, actual);
        calculator.setResult(calculator.multiplikation(a,b));
        calculator.setResult(calculator.division(calculator.getResult(),c));
    }

    @Test
    public void calculateDivisionThenMultiplikation() {
        int a = 6;
        int b = 3;
        int c = 2;
        int expected = 0;
        int actual = calculator.getResult();
        assertEquals(expected, actual);
        calculator.setResult(calculator.division(a,b));
        calculator.setResult(calculator.multiplikation(calculator.getResult(),c));
    }


}
