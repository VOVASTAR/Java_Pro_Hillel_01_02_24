package edu.hillel.lectures.generics.wildCard;

class WildCard {

    public static void main(String[] args) {

        Integer intArray[] = {100, 200, 300, 400, 500};
        Double doubleArray[] = {100.0, 200.0, 300.0, 400.0, 500.0};

        Average<Integer> iob = new Average<>(intArray);
        Average<Double> dob = new Average<>(doubleArray);

        if (iob.sameAvg(dob)) {
            System.out.println("are the same.");
        } else {
            System.out.println("differ.");
        }
    }
}