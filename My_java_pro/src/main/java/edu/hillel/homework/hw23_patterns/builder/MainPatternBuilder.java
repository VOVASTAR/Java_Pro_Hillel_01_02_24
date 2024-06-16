package edu.hillel.homework.hw23_patterns.builder;

public class MainPatternBuilder {

    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        Car car = carBuilder.setWheels("17 inch").setEngine("500 hp").setLight("Led").buildCar();
        Car car2 = carBuilder.setEngine("359 hp").buildCar();

        System.out.println(car);
        System.out.println(car2);
    }
}
