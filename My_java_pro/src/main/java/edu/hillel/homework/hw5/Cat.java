package edu.hillel.homework.hw5;

public class Cat extends Animal {

    private static final double MAX_RUNNING_LENGTH = 200;

    public Cat(String name, Observable... observables) {
        super(name, observables);
    }

    @Override
    public void run(double obstructedLength) {
        maxRunningLength = MAX_RUNNING_LENGTH;
        super.run(obstructedLength);
    }

    @Override
    public void swim(double obstructedLength) {
        System.out.println(getName() + " can`t swim.");
    }

}
