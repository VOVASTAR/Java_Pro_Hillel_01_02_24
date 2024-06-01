package hw13_junit_tests;

import java.util.Arrays;

public class SimpleArrayLibrary {

    public int[] returnArrayAfterLastNumberFour(int[] array) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int arrayLength = array.length;
        int indexOfLastNumberFour = 0;

        for (int i = arrayLength - 1; i >= 0; i--) {
            if (array[i] == 4) {
                indexOfLastNumberFour = i;
                break;
            }
        }

        if (indexOfLastNumberFour == 0) {
            throw new RuntimeException("Number 4 is not in the array");
        }

        return Arrays.copyOfRange(array, indexOfLastNumberFour + 1, arrayLength);
    }

    public boolean isArrayConsistOnlyNumberOneAndFour(int[] array) {
        boolean hasOne = false;
        boolean hasFour = false;

        for (int number : array) {
            if (number == 1) {
                hasOne = true;
            } else if (number == 4) {
                hasFour = true;
            } else {
                return false;
            }
        }
        return hasOne && hasFour;
    }
}
    

