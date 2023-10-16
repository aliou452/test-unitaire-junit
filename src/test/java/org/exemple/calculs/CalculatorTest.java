package org.exemple.calculs;


import org.example.calculs.Calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


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

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void isPairTest(int num) {

        boolean result = Calculator.isPair(num);

        assertEquals(num%2 == 0, result);
    }

    @Test
    void diviseTest() {
        Calculator calculator = new Calculator(20, 4);

        int result = calculator.divise();

        assertEquals(5, result);
    }
}
