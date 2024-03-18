package homework.hw11_Exception;

import java.util.Arrays;

public class ArrayValueCalculator {

    public void doCalc(String[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array.length != 4 || array[i].length != array.length)
                throw new ArraySizeException("Illegal array size, should be 4 х 4");

            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException exception) {
                    throw new ArrayDataException("Invalid number format at index " + "[ " + i + ", " + j + " ]");
                } catch (ArrayIndexOutOfBoundsException index) {
                    System.out.println(index.getMessage());
                }
            }
        }
        System.out.println(sum);
    }

    //---------- additional with streams
    public void doCalcStream(String[][] array) {
        if (array.length != 4 && array[0].length != array.length)
            throw new ArraySizeException("Illegal array size, should be 4 х 4");
        int sum = 0;
        try {
            sum = Arrays.stream(array)
                    .flatMap(Arrays::stream)
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);
        } catch (NumberFormatException exception) {
            throw new ArrayDataException("NumberFormatException");
        }
        System.out.println(sum);
    }
}
