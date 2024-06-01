package edu.hillel.homework.hw17_Generics.fruitsStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Box<T extends Fruit> {

    private List<T> itemsStorage;

    public Box() {
        this.itemsStorage = new ArrayList<>();
    }

    public void addFruitToBox(T item) {
        this.itemsStorage.add(item);
    }

    public void multiAddFruitToBox(List<T> items) {
        this.itemsStorage.addAll(items);
    }

    public float getBoxWeight() {
        Optional<T> item = itemsStorage.stream().findAny();
        return item.isPresent() ? itemsStorage.size() * item.get().getWeightOfItem() : 0f;
    }

    public List<T> getItemsStorage() {
        return itemsStorage;
    }

    public boolean compare(Box<?> box) {
        return getBoxWeight() == box.getBoxWeight();
    }

    public void merge(Box<T> box) {
        itemsStorage.addAll(box.itemsStorage);
        box.itemsStorage.clear();
    }
}


