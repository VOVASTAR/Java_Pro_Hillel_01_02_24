package edu.hillel.homework.hw6.figures;

public class Circle implements GeometricFigures {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double figureArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
