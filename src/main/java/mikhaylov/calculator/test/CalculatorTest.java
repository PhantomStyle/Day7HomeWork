package mikhaylov.calculator.test;


import junit.framework.TestCase;
import junit.framework.TestResult;
import mikhaylov.calculator.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest extends TestCase {

    private Calculator calculator;

    @Before
    public void init() {
        System.out.println("Initializing...");
        calculator = new Calculator();
    }

    @After
    public void clean() {
        System.out.println("Removing calculator...");
        calculator = null;
    }

    @Test
    public void whenZeroToFactorialReturn1() {
        System.out.println("Running whenZeroToFactorialReturn1()");
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    public void when5ToFactorialReturn120() {
        System.out.println("Running when5ToFactorialReturn120()");
        assertTrue(calculator.factorial(5) == 120);
    }

    @Test
    public void when15Add30Return45() {
        System.out.println("Running when15Add30Return45()");
        assertNotNull(calculator.add(15, 30));
    }

    @Override
    public TestResult run() {
        init();
        when5ToFactorialReturn120();
        when15Add30Return45();
        whenZeroToFactorialReturn1();
        clean();
        return null;
    }
}
