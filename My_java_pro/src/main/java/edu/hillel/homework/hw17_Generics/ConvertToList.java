package edu.hillel.homework.hw17_Generics;

import java.util.ArrayList;
import java.util.List;

public class ConvertToList {

    public <T> List<T> toList(T[] array) {
        return new ArrayList<>(List.of(array));
    }
}
