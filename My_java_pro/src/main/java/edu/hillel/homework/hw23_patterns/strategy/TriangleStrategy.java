package edu.hillel.homework.hw23_patterns.strategy;

public class TriangleStrategy implements FigureAreaStrategy {

    private double sizeA;
    private double sizeB;
    private double sizeC;

    public TriangleStrategy(double sizeA, double sizeB, double sizeC) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
    }

    @Override
    public double getArea() {
        double p = (sizeA + sizeB + sizeC) / 2;
        return Math.sqrt(p * (p - sizeA) * (p - sizeB) * (p - sizeC));
    }

}
