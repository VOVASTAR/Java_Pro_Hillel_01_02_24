package homework.hw12.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfCars implements HighOrderFunction {

    private List<String> cars;

    public ListOfCars() {
        cars = new ArrayList<>();
    }

    public List<String> getCars() {
        return cars;
    }

    private String transformFromHex(String str) {
        if (str.matches("[A-Fa-f\\d]+")) {
            str = Arrays.stream(str.split("(?<=\\G..)"))
                    .map(s -> Character.toString(Integer.parseInt(s, 16)))
                    .collect(Collectors.joining());
        }
        return str;
    }

    private String addUnderlineToOddNumber(String s) {
        if (s.length() % 2 == 1) {
            s += "_";
        }
        return s;
    }

    @Override
    public List<String> modify() {
        return cars.stream()
                .map(this::transformFromHex)
                .map(s -> new StringBuilder(s).reverse().toString())
                .map(this::addUnderlineToOddNumber)
                .toList();
    }
}
