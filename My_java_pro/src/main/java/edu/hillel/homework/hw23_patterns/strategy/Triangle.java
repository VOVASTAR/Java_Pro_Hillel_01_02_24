package edu.hillel.homework.hw23_patterns.strategy;

public class Triangle extends Figure {

    public Triangle(double sizeA, double sizeB, double sizeC) {
        this.figureAreaStrategy = new TriangleStrategy(sizeA, sizeB, sizeC);
    }
}
