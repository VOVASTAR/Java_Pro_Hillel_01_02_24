package edu.hillel.homework.hw23_patterns.factory;

public class Chair implements Furniture {
    @Override
    public void typeOfFurniture() {
        System.out.println("This is chair");
    }
}
