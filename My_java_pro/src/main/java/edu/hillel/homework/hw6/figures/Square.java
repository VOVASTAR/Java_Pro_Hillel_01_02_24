package edu.hillel.homework.hw6.figures;

public class Square implements GeometricFigures {

    private double size;

    public Square(double size) {
        this.size = size;
    }

    @Override
    public double figureArea() {
        return Math.pow(size, 2);
    }
}
