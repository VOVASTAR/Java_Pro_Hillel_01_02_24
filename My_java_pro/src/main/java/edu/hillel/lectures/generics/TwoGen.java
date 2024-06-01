package edu.hillel.lectures.generics;

class TwoGen<T, V> {
    private T obT;
    private V obV;

    public TwoGen(T obT, V obV) {
        this.obT = obT;
        this.obV = obV;
    }

    public void showTypes() {
        System.out.println("Тип T: " + obT.getClass().getName());
        System.out.println("Тип V: " + obV.getClass().getName());
    }

    public T getObT() {
        return obT;
    }

    public V getObV() {
        return obV;
    }
}

class SimpleGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> twoGen = new TwoGen<>(88, "Generics");

        twoGen.showTypes();
        System.out.println("Значение T: " + twoGen.getObT());
        System.out.println("Значение V: " + twoGen.getObV());
    }
}
