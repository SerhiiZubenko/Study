package Tests;

import Java.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void additionTest() {
        assertEquals(9, Calculator.addition(4, 5));
    }

    @Test
    public void substractionTest() {
        assertEquals(6, Calculator.substraction(11, 5));
    }

    @Test
    public void multiplicationTest() {
        assertEquals(18, Calculator.multiplication(9, 2));
    }

    @Test
    public void dividingTest() {
        assertEquals(10, Calculator.dividing(20, 2));
    }
}