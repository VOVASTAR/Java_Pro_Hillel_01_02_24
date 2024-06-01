package edu.hillel.homework.hw4;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Start AKB");
    }

    private void startCommand() {
        System.out.println("Start engine");
    }

    private void startFuelSystem() {
        System.out.println("Take gazoline into system");
    }
}
