package homework.hw16AlgorithmSorting;

import homework.hw16AlgorithmSorting.mergeSort.MergeSort;
import homework.hw16AlgorithmSorting.quickSort.QuickSort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MainSorting {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();

        int[] arrayQuick = IntStream.generate(() -> (int) (10000 * Math.random()))
                .limit(10)
                .toArray();
        int[] arrayMerge = Arrays.copyOf(arrayQuick, arrayQuick.length);

        long startTimeQuick = System.currentTimeMillis();
        quickSort.quickSort(arrayQuick, 0, arrayQuick.length - 1);
        long endTimeQuick = System.currentTimeMillis();
        System.out.println("running time quick sort: " + (endTimeQuick - startTimeQuick) + " ms");

        long startTimeMerge = System.currentTimeMillis();
        mergeSort.mergeSort(arrayMerge);
        long endTimeMerge = System.currentTimeMillis();
        System.out.println("running time merge sort: " + (endTimeMerge - startTimeMerge) + " ms");
    }
}
