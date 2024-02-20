package homework.hw7.countOccurance;

import java.util.ArrayList;
import java.util.List;

public class Occurance {

    public int countOccurance(List<String> stringList, String stringExample) {
        int counter = 0;
        for (String string : stringList) {
            if (string.equals(stringExample)) {
                counter++;
            }
        }
        return counter;
    }

    public List<Integer> toList(int[] number) {
        List<Integer> revesredList = new ArrayList<>();
        for (int i = number.length - 1; i >= 0; i--) {
            revesredList.add(number[i]);
        }
        return revesredList;
    }

    public List<Integer> findUnique(List<Integer> entryList) {
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer number : entryList) {
            if (!uniqueList.contains(number)) {
                uniqueList.add(number);
            }
        }
        return uniqueList;
    }

    public void calcOccurance(List<String> stringList) {
        stringList.sort(String::compareTo);
        int counter = 1;
        for (int i = 1; i < stringList.size(); i++) {
            if (stringList.get(i - 1).equals(stringList.get(i))) {
                counter++;
            } else {
                System.out.println(stringList.get(i - 1) + ": " + counter);
                counter = 1;
            }
        }
    }

    public List<ListOccurrence> findOccurance(List<String> stringList) {
        List<String> uniqueStrings = new ArrayList<>();
        List<ListOccurrence> counterStrings = new ArrayList<>();

        for (String string : stringList) {
            if (!uniqueStrings.contains(string)) {
                uniqueStrings.add(string);
            }
        }

        for (String uniqueString : uniqueStrings) {
            int counter = 0;
            for (String string : stringList) {
                if (uniqueString.equals(string)) {
                    counter++;
                }
            }
            counterStrings.add(new ListOccurrence(uniqueString, counter));
        }
        return counterStrings;
    }

}
