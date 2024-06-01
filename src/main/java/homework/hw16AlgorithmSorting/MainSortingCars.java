package homework.hw16AlgorithmSorting;

import java.util.Arrays;
import java.util.Comparator;

public class MainSortingCars {

    public static void main(String[] args) {
        Sorting<Cars> quickSort = new Sorting<>();
        Sorting<Cars> mergeSort = new Sorting<>();
        Comparator<Cars> comparator = Comparator.comparing(Cars::getBrand)
                .thenComparing(Cars::getYear);

        Cars[] carsQuick = {
                new Cars("Tesla", "X", 2018),
                new Cars("BMW", "535", 2012),
                new Cars("Toyota", "Camry", 2019),
                new Cars("Honda", "Accord", 2015),
                new Cars("BMW", "M3", 2022),
                new Cars("Tesla", "S", 2023),
                new Cars("BMW", "760", 2022),
                new Cars("Tesla", "3", 2024),
                new Cars("Ferrari", "F1", 2020)
        };
        Cars[] carsMerge = Arrays.copyOf(carsQuick, carsQuick.length);

        long startTimeQuick = System.currentTimeMillis();
        quickSort.quickSort(carsQuick, 0, carsQuick.length - 1, comparator);
        Arrays.stream(carsQuick).forEach(System.out::println);
        long endTimeQuick = System.currentTimeMillis();
        System.out.println("running time quick sort: " + (endTimeQuick - startTimeQuick) + " ms");

        System.out.println();

        long startTimeMerge = System.currentTimeMillis();
        mergeSort.mergeSort(carsMerge, comparator);
        Arrays.stream(carsMerge).forEach(System.out::println);
        long endTimeMerge = System.currentTimeMillis();
        System.out.println("running time merge sort: " + (endTimeMerge - startTimeMerge) + " ms");
    }
}
