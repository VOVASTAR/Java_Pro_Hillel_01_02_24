package homework.hw.figures;

public class Triangle implements GeometricFigures {

    private double sizeA;
    private double sizeB;
    private double sizeC;

    public Triangle(double sizeA, double sizeB, double sizeC) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
    }

    @Override
    public double figureArea() {
        double p = (sizeA + sizeB + sizeC) / 2;
        return Math.sqrt(p * (p - sizeA) * (p - sizeB) * (p - sizeC));
    }
}
