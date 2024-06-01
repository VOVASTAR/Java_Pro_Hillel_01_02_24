package edu.hillel.homework.hw5;

import java.util.ArrayList;
import java.util.List;

public class AnimalObservable implements Observable {

    private List<Observer> animalsGroup = new ArrayList<>();

    @Override
    public void addAnimalObserver(Observer observer) {
        animalsGroup.add(observer);
    }

    @Override
    public int countAnimal() {
        int counter = 0;
        for (Observer animal : animalsGroup) {
            counter++;
        }
        return counter;
    }

    public int checkPopulation() {
        return countAnimal();
    }
}
