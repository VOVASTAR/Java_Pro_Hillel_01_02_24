package edu.hillel.homework.hw23_patterns.factory;

import static edu.hillel.homework.hw23_patterns.factory.FurnitureFabric.FurnitureType.*;

public class MainPatternFabric {
    public static void main(String[] args) {
        FurnitureFabric fabric = new FurnitureFabric();
        fabric.createFurniture(TABLE).typeOfFurniture();
        fabric.createFurniture(BED).typeOfFurniture();
        fabric.createFurniture(CHAIR).typeOfFurniture();
    }
}
