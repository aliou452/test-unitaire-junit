package org.exemple.calculs;


import org.example.calculs.Calculator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

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

        int result = calculator.divide();

        assertEquals(5, result);
    }

    @Test
    @Disabled
    void toBeIgnore() {
    }

    @Test
    void substractTest() {
        Calculator calculator = new Calculator(17, 4);
        int resultat = calculator.substract();

        assertEquals(13, resultat);
    }

    @ParameterizedTest
    @MethodSource("integersProvider")
    void subtractMultipleTest(int num1, int num2, int expected) {

        Calculator calculator = new Calculator(num1, num2);
        int resultat = calculator.substract();

        assertEquals(expected, resultat);
    }

    @Test
    void divideByZero() {
        Calculator calculator = new Calculator(10, 0);
        assertThrows(ArithmeticException.class, calculator::divide);
    }

    static Stream<Arguments> integersProvider() {
        return Stream.of(
                Arguments.arguments(14, 3, 11),
                Arguments.arguments(11, 9, 2),
                Arguments.arguments(5, 1, 4),
                Arguments.arguments(70, 40, 30)
        );
    }

}
