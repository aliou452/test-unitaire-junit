package org.exemple.calculs;


import org.example.calculs.Calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {




    @Test
    void addTest() {
        Calculator calculator = new Calculator(2, 5);

        int res = calculator.add();
        int expectedValue = 7;

        assertEquals(expectedValue, res);
        assertNotEquals(9, res);
    }

    @Test
    void toStringTest() {
        Calculator calculator = new Calculator(2, 8);

        String string = calculator.toString();
        String expectedValue = "num1:2; num2:8";

        assertEquals(expectedValue, string);
    }

    @Test
    void diviseTest() {
        Calculator calculator = new Calculator(20, 4);

        int result = calculator.divise();

        assertEquals(5, result);
    }
}
