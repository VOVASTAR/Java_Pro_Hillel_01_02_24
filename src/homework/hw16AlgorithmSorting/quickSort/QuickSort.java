package homework.hw16AlgorithmSorting.quickSort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] array = IntStream.generate(() -> (int) (10000 * Math.random()))
                .limit(30)
                .toArray();

        System.out.println(Arrays.toString(array));
        long startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(quickSort.quickSort(array, 0, array.length - 1)));
        long endTime = System.currentTimeMillis();
        System.out.println("running time: " + (endTime - startTime) + " ms");
    }

    public int[] quickSort(int[] array, int indexFrom, int indexTo) {
        int leftIndex = indexFrom;
        int rightIndex = indexTo;
        int pivot = array[(indexFrom + indexTo) / 2];
        if (indexFrom < indexTo) {
            while (leftIndex <= rightIndex) {
                while (array[leftIndex] < pivot) leftIndex++;
                while (array[rightIndex] > pivot) rightIndex--;

                if (leftIndex <= rightIndex) {
                    swap(array, leftIndex, rightIndex);
                    leftIndex++;
                    rightIndex--;
                }
            }
            quickSort(array, indexFrom, leftIndex - 1);
            quickSort(array, leftIndex, indexTo);
        }
        return array;
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
