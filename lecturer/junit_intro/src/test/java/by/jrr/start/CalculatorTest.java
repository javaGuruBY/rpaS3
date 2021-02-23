package by.jrr.start;

import junit.framework.TestCase;
import org.junit.*;

public class CalculatorTest extends TestCase {

    Calculator calculator = new Calculator();

    @Before
public void setUp(){
    System.out.println("setUp");
    calculator = new Calculator();
}


@After
public void tearDown(){
    System.out.println("tearDown");
    calculator = new Calculator();
}

    @BeforeClass
    public static void globalSetUp(){
        System.out.println("globalSetUp");
    }

    @AfterClass
    public static void globalTearDown(){
        System.out.println("globalTearDown");

    }

    public void calculateMultiplicationThenDivision() {
        int a = 3;
        int b = 4;
        int c = 2;
        int expected = 6;
        int actual = calculator.getResult();
        assertEquals(expected, actual);
        calculator.setResult(calculator.multiplikation(a,b));
        calculator.setResult(calculator.division(calculator.getResult(),c));
    }

    public void calculateDivisionThenMultiplikation() {
        int a = 6;
        int b = 3;
        int c = 2;
        int expected = 4;
        int actual = calculator.getResult();
        assertEquals(expected, actual);
        calculator.setResult(calculator.division(a,b));
        calculator.setResult(calculator.multiplikation(calculator.getResult(),c));
    }




    public void testMultiplikation() {
        int a = 3;
        int b = 4;
        int expected = 12;
        int actual = calculator.multiplikation(a,b);
        assertEquals(expected, actual);
    }

    public void testDivision() {
        int a = 12;
        int b = 4;
        int expected = 3;
        int actual = calculator.division(a,b);
        assertEquals(expected, actual);
    }


}