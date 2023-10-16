package org.exemple.calculs;


import org.example.calculs.Calculator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Class for testing Calculator")
public class CalculatorTest {

    Calculator defaultCalculator;

    @BeforeEach
    void init() {
        defaultCalculator = new Calculator(2, 5);
    }


    @Test
    @DisplayName("Test calculator add method")
    void addTest() {
        Calculator calculator = defaultCalculator;

        int res = calculator.add();
        int expectedValue = 7;

        assertEquals(expectedValue, res);
        assertNotEquals(9, res);
    }

    @Test
    @DisplayName("Test calculator string method")
    void toStringTest() {
        Calculator calculator = defaultCalculator;

        String string = calculator.toString();
        String expectedValue = "num1:2; num2:5";

        assertEquals(expectedValue, string);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    @DisplayName("Test pair method")
    void isPairTest(int num) {

        boolean result = Calculator.isPair(num);

        assertEquals(num%2 == 0, result);
    }

    @Test
    @DisplayName("Test divise method")
    void diviseTest() {
        Calculator calculator = new Calculator(20, 4);

        int result = calculator.divise();

        assertEquals(5, result);
    }

    @Test
    @Disabled
    void toBeIgnore() {

    }
}
