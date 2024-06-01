package edu.hillel.homework.hw16AlgorithmSorting.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public void mergeSort(int[] array) {
        int arrayLength = array.length;
        if (array == null || arrayLength < 2) {
            return;
        }

        int arrayMiddle = arrayLength / 2;

        int[] leftSort = Arrays.copyOfRange(array, 0, arrayMiddle);
        int[] rightSort = Arrays.copyOfRange(array, arrayMiddle, arrayLength);

        mergeSort(leftSort);
        mergeSort(rightSort);

        merge(array, leftSort, rightSort);
    }

    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
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
}
