package Tests;

import Java.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void addStringIsEmpty() {
        assertEquals(0, StringCalculator.addString("0"));
    }

    @Test
    void addStringIsNotEmpty() {
        assertEquals(1, StringCalculator.addString("1"));
    }

    @Test
    void addStringTwoNumbers() {
        assertEquals(3, StringCalculator.addString("1,2"));
    }

    @Test
    void addStringNnumbers() {
        assertEquals(7, StringCalculator.addString("1,2,4"));
    }

    @Test
    void addStringBetweenRows() {
        assertEquals(7, StringCalculator.addString("1,2\n4"));
    }

    @Test
    void addStringSupportDifferentsDelimiters() {
        assertEquals(6, StringCalculator.addString("//;\n1;2;3"));
    }

    @Test
    void addStringWithNumberBiggerThan() {
        assertEquals(3, StringCalculator.addString("//;\n1;2;3000"));
    }

    @Test
    void addStringSupportDiffer() {
        assertEquals(6, StringCalculator.addString("//;\n1;;;2;3"));
    }
}

