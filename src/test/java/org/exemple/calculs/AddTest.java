package org.exemple.calculs;


import org.example.calculs.Add;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AddTest {




    @Test
    void addTwoNumbersTest() {
        Add add = new Add(2, 5);

        int res = add.addTwoNumbers();
        int expectedValue = 7;

        assertEquals(expectedValue, res);
        assertNotEquals(9, res);
    }

    @Test
    void toStringTest() {
        Add add = new Add(2, 8);

        String string = add.toString();
        String expectedValue = "num1:2; num2:8";

        assertEquals(expectedValue, string);
    }
}
