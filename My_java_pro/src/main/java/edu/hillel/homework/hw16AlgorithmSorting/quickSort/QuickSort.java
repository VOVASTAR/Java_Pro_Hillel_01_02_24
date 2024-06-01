package edu.hillel.homework.hw16AlgorithmSorting.quickSort;

public class QuickSort {

    public void quickSort(int[] array, int indexFrom, int indexTo) {
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
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
