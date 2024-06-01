package homework.hw16AlgorithmSorting;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting<T> {
    public void mergeSort(T[] array, Comparator<T> comparator) {
        int arrayLength = array.length;
        if (array == null || arrayLength < 2) {
            return;
        }

        int arrayMiddle = arrayLength / 2;

        T[] leftSort = Arrays.copyOfRange(array, 0, arrayMiddle);
        T[] rightSort = Arrays.copyOfRange(array, arrayMiddle, arrayLength);

        mergeSort(leftSort, comparator);
        mergeSort(rightSort, comparator);

        merge(array, leftSort, rightSort, comparator);
    }

    private void merge(T[] arr, T[] left, T[] right, Comparator<T> comparator) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (comparator.compare(left[i], right[j]) < 0) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public void quickSort(T[] array, int indexFrom, int indexTo, Comparator<T> comparator) {
        int leftIndex = indexFrom;
        int rightIndex = indexTo;
        T pivot = array[(indexFrom + indexTo) / 2];
        if (indexFrom < indexTo) {
            while (leftIndex <= rightIndex) {
                while (comparator.compare(array[leftIndex], pivot) < 0) leftIndex++;
                while (comparator.compare(array[rightIndex], pivot) > 0) rightIndex--;

                if (leftIndex <= rightIndex) {
                    swap(array, leftIndex, rightIndex);
                    leftIndex++;
                    rightIndex--;
                }
            }
            quickSort(array, indexFrom, leftIndex - 1, comparator);
            quickSort(array, leftIndex, indexTo, comparator);
        }
    }

    private void swap(T[] array, int left, int right) {
        T temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}







