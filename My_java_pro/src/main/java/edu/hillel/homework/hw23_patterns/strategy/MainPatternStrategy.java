package edu.hillel.homework.hw23_patterns.strategy;

public class MainPatternStrategy {
    public static void main(String[] args) {
        Figure figure1 = new Rectangle(5, 8.4);
        Figure figure2 = new Triangle(5.7, 8, 4.4);

        System.out.println(figure1.getArea());
        System.out.println(figure2.getArea());
    }
}
