package homework.hw_20_multiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class PetrolStation {
    private ReentrantLock locker = new ReentrantLock();
    private double storageFuelAmount = 20.0;

    public void doRefuel(double fuelAmount) {
        storageFuelAmount -= fuelAmount;
    }

    public double getStorageFuelAmount() {
        return storageFuelAmount;
    }

    public ReentrantLock getLocker() {
        return locker;
    }
}
