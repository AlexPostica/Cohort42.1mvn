package lesson21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        Assertions.assertEquals(4, calculator.add(2, 2));
    }
    @Test
    public void testSub() {
        Assertions.assertEquals(5, calculator.sub(7, 2) );
    }
    @Test
    public void testMut() {
        Assertions.assertEquals(6, calculator.mut(3, 2));
    }
    @Test
    public void testDiv() {
        Assertions.assertEquals(5, calculator.div(10, 2));
    }
}
