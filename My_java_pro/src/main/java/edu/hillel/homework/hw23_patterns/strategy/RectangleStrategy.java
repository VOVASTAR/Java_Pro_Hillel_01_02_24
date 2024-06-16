package edu.hillel.homework.hw23_patterns.strategy;

public class RectangleStrategy implements FigureAreaStrategy {

    private double sizeA;
    private double sizeB;

    public RectangleStrategy(double sizeA, double sizeB) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    @Override
    public double getArea() {
        return sizeA * sizeB;
    }
}
