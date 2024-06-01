package edu.hillel.homework.hw17_Generics;

import edu.hillel.homework.hw17_Generics.fruitsStore.Apple;
import edu.hillel.homework.hw17_Generics.fruitsStore.Box;
import edu.hillel.homework.hw17_Generics.fruitsStore.Orange;

import java.util.List;

public class MainGenerics {

    public static void main(String[] args) {
        ConvertToList convertToList = new ConvertToList();
        String[] array = {"2", "5", "24", "7"};
        List<String> list = convertToList.toList(array);
        list.forEach(System.out::println);

        Box<Orange> boxOrange = new Box<>();
        Box<Apple> boxApple1 = new Box<>();
        Box<Apple> boxApple2 = new Box<>();

        boxOrange.addFruitToBox(new Orange());
        boxOrange.multiAddFruitToBox(List.of(new Orange(), new Orange(), new Orange()));
        boxApple1.addFruitToBox(new Apple());
        boxApple1.multiAddFruitToBox(List.of(new Apple(), new Apple(), new Apple(), new Apple(), new Apple()));
        boxApple2.multiAddFruitToBox(List.of(new Apple(), new Apple(), new Apple(), new Apple()));

        System.out.println(boxApple1.getItemsStorage().size());
        System.out.println(boxApple2.getItemsStorage().size());
        System.out.println(boxOrange.compare(boxApple1));
        boxApple1.merge(boxApple2);
        System.out.println(boxApple1.getItemsStorage().size());
        System.out.println(boxApple2.getItemsStorage().size());
        System.out.println(boxApple1.getBoxWeight());
        System.out.println(boxApple2.getBoxWeight());
        System.out.println(boxOrange.compare(boxApple1));
    }
}