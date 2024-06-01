package edu.hillel.homework.hw16AlgorithmSorting;

public class Cars {

    private String brand;
    private String model;
    private int year;

    public Cars(String brand, String color, int year) {
        this.brand = brand;
        this.model = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
