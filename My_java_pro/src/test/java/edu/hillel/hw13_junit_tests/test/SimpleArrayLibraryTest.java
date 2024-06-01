package edu.hillel.hw13_junit_tests.test;

import edu.hillel.hw13_junit_tests.SimpleArrayLibrary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SimpleArrayLibraryTest {

    private SimpleArrayLibrary testRunner;

    int[] array = {1, 2, 4, 4, 2, 3, 4, 1, 7};
    int[] arrayWithoutFour = {1, 2, 5, 2, 2, 3, 3, 6, 7};
    int[] arrayNull = null;
    int[] arrayEmpty = {};

    int[] arrayOnlyOneAndFour = {1, 1, 1, 4, 4, 1, 4, 4};
    int[] arrayOnlyOne = {1, 1, 1, 1, 1, 1};
    int[] arrayOnlyFour = {4, 4, 4, 4};
    int[] arrayDifferentNumbers = {1, 4, 4, 1, 1, 4, 3};

    @BeforeEach
    public void setup() {
        testRunner = new SimpleArrayLibrary();
    }

    @Test
    public void recieveNewArrayAfterLastNumberFour() {
        int[] expectedArray = {1, 7};
        int[] actualArray = testRunner.returnArrayAfterLastNumberFour(array);
        System.out.println(Arrays.toString(actualArray));
        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void checkArrayWithOutNumberFour() {
        Assertions.assertThrows(RuntimeException.class, () -> testRunner.returnArrayAfterLastNumberFour(arrayWithoutFour));
    }

    @Test
    public void checkNullArray() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> testRunner.returnArrayAfterLastNumberFour(arrayNull));
    }

    @Test
    public void checkEmptyArray() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> testRunner.returnArrayAfterLastNumberFour(arrayEmpty));
    }

    @Test
    public void checkArrayOnlyOneAndFour() {
        Assertions.assertTrue(testRunner.isArrayConsistOnlyNumberOneAndFour(arrayOnlyOneAndFour));
    }

    @Test
    public void checkArrayOnlyOne() {
        Assertions.assertFalse(testRunner.isArrayConsistOnlyNumberOneAndFour(arrayOnlyOne));
    }

    @Test
    public void checkArrayOnlyFour() {
        Assertions.assertFalse(testRunner.isArrayConsistOnlyNumberOneAndFour(arrayOnlyFour));
    }

    @Test
    public void checkArrayDifferentNumbers() {
        Assertions.assertFalse(testRunner.isArrayConsistOnlyNumberOneAndFour(arrayDifferentNumbers));
    }
}
