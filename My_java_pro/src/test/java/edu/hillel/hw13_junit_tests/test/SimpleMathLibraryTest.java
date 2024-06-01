package edu.hillel.hw13_junit_tests.test;

import edu.hillel.hw13_junit_tests.SimpleMathLibrary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleMathLibraryTest {

    private SimpleMathLibrary simpleMathLibrary;

    @BeforeEach
    public void setUp() {
        simpleMathLibrary = new SimpleMathLibrary();
    }

    @Test
    public void checkSumOfTwoNumbers() {
        double number1 = 1.95;
        double number2 = 6.5;
        double add = simpleMathLibrary.add(number1, number2);
        Assertions.assertEquals(8.45, add, "Sum of " + number1 + " + " + number2);
    }

    @Test
    public void checkSubtractOfTwoNumbers() {
        double number1 = 1.95;
        double number2 = 6.5;
        double add = simpleMathLibrary.minus(number1, number2);
        Assertions.assertEquals(-4.55, add, "Subtract of " + number1 + " + " + number2);
    }
}
