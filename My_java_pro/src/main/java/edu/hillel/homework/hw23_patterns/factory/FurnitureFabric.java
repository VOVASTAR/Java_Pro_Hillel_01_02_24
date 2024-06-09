package edu.hillel.homework.hw23_patterns.factory;

public class FurnitureFabric {

    public Furniture createFurniture(FurnitureType type) {
        return switch (type) {
            case BED -> new Bed();
            case CHAIR -> new Chair();
            case TABLE -> new Table();
        };
    }

    public enum FurnitureType {
        TABLE, CHAIR, BED;
    }
}
