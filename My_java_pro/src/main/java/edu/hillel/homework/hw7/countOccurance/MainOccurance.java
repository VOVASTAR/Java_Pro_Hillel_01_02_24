package edu.hillel.homework.hw7.countOccurance;

import java.util.ArrayList;
import java.util.List;

public class MainOccurance {

    public static void main(String[] args) {

        Occurance occurance = new Occurance();
        List<String> stringList = List.of("Sumsung", "Apple", "Xiaomi", "Pixel", "Sumsung", "Xiaomi", "Apple", "Sumsung", "Xiaomi", "Nokia", "Huawei");
        int[] stringArray = {1, 9, 3, 1, 2, 5, 6, 3, 2, 2, 1, 2, 4, 5, 9, 7};
        List<Integer> numberList = List.of(1, 9, 3, 1, 2, 5, 6, 3, 2, 2, 1, 2, 4, 5, 9, 7);

        String stringExample = "Xiaomi";
        int countOccurance = occurance.countOccurance(stringList, stringExample);
        System.out.println("Brand " + stringExample + " occurance into list " + countOccurance + " times." + "\n");

        System.out.println("Reverse array: " + occurance.toList(stringArray) + "\n");

        System.out.println("Unique array: " + occurance.findUnique(numberList) + "\n");

        System.out.println("Counted list of brands:");
        occurance.calcOccurance(new ArrayList<>(stringList));

        System.out.println("\nStructured counted list of brands" + occurance.findOccurance(stringList));
    }
}
