package edu.hillel.lectures.generics.wildCard;

class Average<T extends Number> {

    private T[] array;

    public Average(T[] array) {
        this.array = array;
    }

    public double average() {
        double sum = 0.0;

        for (T value : array) {
            sum += value.doubleValue();
        }

        return sum / array.length;
    }

    boolean sameAvg(Average<?> ob) {
        return average() == ob.average(); // через == сравниваем, потому что возвращаемый тип double
    }
}

