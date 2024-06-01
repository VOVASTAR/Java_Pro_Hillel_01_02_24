package edu.hillel.homework.hw5;

public class Dog extends Animal {

    private static final double MAX_RUNNING_LENGTH = 500;
    private static final double MAX_SWIMMING_LENGTH = 10;

    public Dog(String name, Observable... observables) {
        super(name, observables);
    }

    @Override
    public void run(double obstructedLength) {
        maxRunningLength = MAX_RUNNING_LENGTH;
        super.run(obstructedLength);
    }

    @Override
    public void swim(double obstructedLength) {
        if (obstructedLength > 0 && obstructedLength <= MAX_SWIMMING_LENGTH) {
            System.out.println(getName() + " swim " + obstructedLength + " meters.");
        } else {
            System.out.println(getName() + " can`t swim " + obstructedLength + " meters.");
        }
    }
}
