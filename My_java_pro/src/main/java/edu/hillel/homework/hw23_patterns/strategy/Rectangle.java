package edu.hillel.homework.hw23_patterns.strategy;

public class Rectangle extends Figure {

    public Rectangle(double sizeA, double sizeB) {
        this.figureAreaStrategy = new RectangleStrategy(sizeA, sizeB);
    }
}
