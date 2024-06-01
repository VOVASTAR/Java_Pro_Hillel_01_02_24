package edu.hillel.homework.hw20_multiThreading.Semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class PetrolStation {
    private ReentrantLock locker = new ReentrantLock();
    private Semaphore activeStation;
    private double storageFuelAmount = 20.0;

    public PetrolStation(int quantityOfActiveStation) {
        this.activeStation = new Semaphore(quantityOfActiveStation);
    }

    public void doRefuel(double fuelAmount) {
        if (storageFuelAmount >= fuelAmount) {
            storageFuelAmount -= fuelAmount;
        } else {
            double volumeIsNotFillUp = fuelAmount - storageFuelAmount;
            System.out.println("You recieve only: " + storageFuelAmount + "The petrolStation is empty, ask to refill station. " +
                    "Left is remain for your require " + volumeIsNotFillUp);
            storageFuelAmount = 0;
        }
    }

    public double getStorageFuelAmount() {
        return storageFuelAmount;
    }

    public ReentrantLock getLocker() {
        return locker;
    }

    public Semaphore getSemaphore() {
        return activeStation;
    }
}
