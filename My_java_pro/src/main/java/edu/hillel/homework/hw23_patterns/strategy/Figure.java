package edu.hillel.homework.hw23_patterns.strategy;

public abstract class Figure {

    FigureAreaStrategy figureAreaStrategy;

    public double getArea() {
        return figureAreaStrategy.getArea();
    }
}
