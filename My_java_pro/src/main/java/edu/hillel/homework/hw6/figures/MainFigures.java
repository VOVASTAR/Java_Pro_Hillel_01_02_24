package edu.hillel.homework.hw6.figures;

public class MainFigures {

    public static void main(String[] args) {
        System.out.println(getAllFiguresArea(figures));
    }

    public static GeometricFigures[] figures = {
            new Circle(2.8),
            new Square(4.6),
            new Triangle(2.3, 1.8, 4)
    };

    public static double getAllFiguresArea(GeometricFigures... figures) {
        double totalArea = 0;
        for (GeometricFigures figure : figures) {
            totalArea += figure.figureArea();
        }
        return totalArea;
    }
}